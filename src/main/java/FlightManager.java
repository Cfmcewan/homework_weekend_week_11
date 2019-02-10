import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights;

    public FlightManager(){
        this.flights = new ArrayList<Flight>();

    }


    public int flightCount() {
        return this.flights.size();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }


    public Flight findFlight(String flightNumber) {
        Flight foundFlight = null;
        for(Flight flight : this.flights){
            if(flight.getFlightNumber().equals(flightNumber)){
                foundFlight = flight;
            }
        }
        return foundFlight;
    }

    public double calculateTotalBaggageWeightPerFlight(Flight flight){
        double planeTotalWeight = flight.getPlaneType().getTotalWeightValue();
        double totalPassengerBaggageWeight = planeTotalWeight/2;
        return totalPassengerBaggageWeight;
    }


    public double calculateBaggageWeightPerPassenger(Flight flight) {
       double totalPassengerWeight = calculateTotalBaggageWeightPerFlight(flight);
        double weightPerPassenger = totalPassengerWeight/flight.getPlaneType().getCapacityValue();
        return weightPerPassenger;

    }

    public double calculateBaggageBookedByPassengers(Flight flight) {
        double passengerBaggage = calculateBaggageWeightPerPassenger(flight);
        double baggageBookedByAllPassengers = passengerBaggage * flight.passengerListCount();
        return baggageBookedByAllPassengers;

    }

    public double calculateRemainingBaggageWeight(Flight flight) {
        double totalBaggage = calculateTotalBaggageWeightPerFlight(flight);
        double bookedBaggage = calculateBaggageBookedByPassengers(flight);
        return totalBaggage - bookedBaggage;
    }
}
