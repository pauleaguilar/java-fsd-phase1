public abstract class Vehicle {

   //all of these are present in most vehicles.
    private String modelName;

    private float topSpeed;

    private String engine;

    private String steeringMechanism;

    //getter method
    public String getModelName() {
        return modelName;
    }
    //setter method
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getSteeringMechanism() {
        return steeringMechanism;
    }

    public void setSteeringMechanism(String steeringMechanism) {
        this.steeringMechanism = steeringMechanism;
    }
    //default constructor for child classes
    public Vehicle() {
        this.isParked = true;
    }
    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.isParked = true;
    }

    boolean isParked;

    public void Park() {

        isParked = true;
    }

    String currentLocation;

    public void Move(String destination) {

        currentLocation = destination;
    }
}
