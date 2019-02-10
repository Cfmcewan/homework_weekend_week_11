public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;

    }


    public PlaneType getPlaneType() {
        return this.planeType;
    }


    public int getCapacityValueFromEnum() {
        return this.planeType.getCapacityValue();
    }

    public int getTotalWeightValueFromEnum() {
        return this.planeType.getTotalWeightValue();
    }
}
