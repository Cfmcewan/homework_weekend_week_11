import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType planeType, String flightNumber, String destinationAirport, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }


    public String getDestinationAirport() {
        return this.destinationAirport;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }


    public String getDepartureTime() {
        return this.departureTime;
    }


    public int passengerListCount() {
        return this.passengers.size();

    }


    public int getNumberOfAvailableSeats() {
        return planeType.getCapacityValue() - this.passengers.size();
    }

    public void addPassenger(Passenger passenger, Flight flight) {
        if(this.getNumberOfAvailableSeats() >= this.passengerListCount()){
            this.passengers.add(passenger);
            passenger.addFlightInfo(flight);
            passenger.getSeatNumber();
            this.getNumberOfAvailableSeats();
        }
    }

    public void addMorePassengers(Passenger passenger, Flight flight, int seatNumber) {
        int newSeatNumber = passenger.getSeatNumber();
        if(newSeatNumber != seatNumber){
            addPassenger(passenger, flight);
        }

    }

}
