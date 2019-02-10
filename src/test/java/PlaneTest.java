import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void getPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void getCapacityValue(){
        assertEquals(250, plane.getCapacityValueFromEnum());
    }

    @Test
    public void getTotalWeightValue(){
        assertEquals(154, plane.getTotalWeightValueFromEnum());
    }
}
