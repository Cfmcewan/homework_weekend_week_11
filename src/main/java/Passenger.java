import java.util.Random;

public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public Object getFlightInfo() {
        return flight;
    }

    public Flight addFlightInfo(Flight flight) {
        this.flight = flight;
        return this.flight;
    }


    public int getSeatNumber() {
        Random rand = new Random();
        int newSeatNumber = rand.nextInt(250) + 1;
        this.seatNumber = newSeatNumber;
        return this.seatNumber;


    }
}
