public class Motorcycle extends Vehicle {

    private boolean kickstand = false;

    public void Park() {
        kickstand = true;
        super.Park();
        System.out.println("Parking the model " + getModelName());
    }
    public void DriveTo(String destination) {
        kickstand = false;
        super.Move(destination);
    }
    public Motorcycle() {
        super();
    }
    public Motorcycle(String modelName) {
        super(modelName);
    }
}
