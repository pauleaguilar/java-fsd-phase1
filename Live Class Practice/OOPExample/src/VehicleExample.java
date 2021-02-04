import java.util.ArrayList;

public class VehicleExample {
    VehicleCarrier vehicleCarrier = new VehicleCarrier();

    public void GetVehicle() {
        vehicleCarrier.CarryVehicle(new Motorcycle("Harley"));
        vehicleCarrier.CarryVehicle(new Car("Tesla"));
        vehicleCarrier.CarryVehicle(new Car("Honda"));
        vehicleCarrier.CarryVehicle(new Motorcycle("Ducatti"));
        vehicleCarrier.ParkAll();
        for(Vehicle v: vehicleCarrier.getVehiclesCarried()) {
            System.out.println(v.getModelName() + " has been carried");
        }
    }


}
