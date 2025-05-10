package Cox_Classli_Tasklar.VehicleCar;

public class Car extends Vehicle{

    private String carName;
    private String maxSpeed;

    public Car(String carName, String maxSpeed) {
        super("Vehicle");
        this.carName = carName;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println(this.carName + " " + "riding");
    }

    public void maxSpeed() {
        System.out.println(this.carName + " max speed = " + this.maxSpeed);
    }

    public static void main(String[] args) {
        new Vehicle("Vehicle").move();
        new Car("maus", "250").move();
        new Car("maus", "250").maxSpeed();
    }
}
