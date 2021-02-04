public class Car extends Vehicle {

    //unique for Cars
    boolean hasSunroof;
    String headLightType;
    String tireType;

    public Car() {
        super();
    }
    //calling the constructor of the vehicle to use modelName
    public Car(String modelName) {
        super(modelName);
    }

    public void ShiftGear(int gear) {

    }

    public void DriveTo(String destination) {
        this.ShiftGear(2);
        this.isParked = false;
        super.Move(destination);
    }

    private boolean parkingBrake = false;

    public void Park() {
        System.out.println("Parking the model name " + getModelName());
        this.parkingBrake = true;
        super.Park();

    }


}
