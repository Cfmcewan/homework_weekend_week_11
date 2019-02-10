import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;

    @Before
    public void before() {
        passenger = new Passenger("Bob White", 2);
        flight = new Flight(PlaneType.BOEING747, "FR756", "GLA", "LON", "10am");

    }

    @Test
    public void canGetName() {
        assertEquals("Bob White", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canGetFlightInfo(){
        assertEquals(null, passenger.getFlightInfo());
    }

    @Test
    public void canAddFlightToPassenger(){
        passenger.addFlightInfo(flight);
        assertEquals(flight, passenger.getFlightInfo());
    }


}
