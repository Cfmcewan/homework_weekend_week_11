public enum PlaneType {

    BOEING747(250, 154);

    private final int capacityValue;
    private final int totalWeightValue;

    PlaneType(int capacityValue, int totalWeightValue){
        this.capacityValue = capacityValue;
        this.totalWeightValue = totalWeightValue;

    }

    public int getCapacityValue(){
        return capacityValue;
    }

    public int getTotalWeightValue(){
        return totalWeightValue;
    }
}
