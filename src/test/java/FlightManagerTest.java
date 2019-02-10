import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Plane plane;
    Flight flight;
    Passenger passenger;


    @Before
    public void before(){
        flightManager = new FlightManager();
        flight = new Flight(PlaneType.BOEING747, "FR756", "GLA", "LON", "10am");
        passenger = new Passenger("Bob White", 2);
        plane = new Plane(PlaneType.BOEING747);


    }

    @Test
    public void flightListStartsEmpty(){
        assertEquals(0, flightManager.flightCount());
    }

    @Test
    public void canAddFlight(){
        flightManager.addFlight(flight);
        assertEquals(1, flightManager.flightCount());
    }

    @Test
    public void canFindFlight(){
        flightManager.addFlight(flight);
        Flight foundFlight = flightManager.findFlight("FR756");
        assertEquals(flight, foundFlight);
    }

    @Test
    public void canCalculateTotalBaggageWeightPerFlight() {
        flightManager.addFlight(flight);
        assertEquals(77, flightManager.calculateTotalBaggageWeightPerFlight(flight), 0.01);

    }

    @Test
    public void canCalculateBaggageWeightPerPassenger(){
        flightManager.addFlight(flight);
        assertEquals(0.3, flightManager.calculateBaggageWeightPerPassenger(flight), 0.01);
    }

    @Test
    public void canCalculateBaggageBookedByPassenger(){
        flightManager.addFlight(flight);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(0.616, flightManager.calculateBaggageBookedByPassengers(flight), 0.01);
    }

    @Test
    public void canCalculateRemainingBaggageWeight(){
        flightManager.addFlight(flight);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(76.384, flightManager.calculateRemainingBaggageWeight(flight), 0.01);
    }


}
