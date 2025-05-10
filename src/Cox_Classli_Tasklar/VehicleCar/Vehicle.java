package Cox_Classli_Tasklar.VehicleCar;

public class Vehicle {

    private String vehicleName;

    public Vehicle() {
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void move() {
        System.out.println(this.vehicleName + " " + "moved");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
