import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    Plane plane;

    @Before
    public void before() {
        flight = new Flight(PlaneType.BOEING747, "FR756", "GLA", "LON", "10am");
        passenger = new Passenger("Bob White", 2);
        passenger2 = new Passenger("Sally White", 1);
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestinationAirport(){
        assertEquals("GLA", flight.getDestinationAirport());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("LON", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("10am", flight.getDepartureTime());
    }

    @Test
    public void passengersBookedZero(){
        assertEquals(0, flight.passengerListCount());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(250, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canAddPassengerIfAvailableSeats(){
        flight.addPassenger(passenger, flight);
        assertEquals(249, flight.getNumberOfAvailableSeats());
        assertEquals(flight, passenger.getFlightInfo());
    }

//    @Test
//    public void checkIfSeatNumberAddedTrue(){
//        flight.addPassenger(passenger, flight);
//        assertEquals(true, flight.seatNumberAdded(passenger));
//    }
//
//    @Test
//    public void checkIfSeatNumberAddedFalse(){
//        assertEquals(false, flight.seatNumberAdded(passenger));
//    }

    @Test
    public void canAddTwoPassengersWithDifferentSeatNumbers(){
        flight.addPassenger(passenger, flight);
        flight.addMorePassengers(passenger, flight, passenger.getSeatNumber());
        assertEquals(248, flight.getNumberOfAvailableSeats());

    }




}
