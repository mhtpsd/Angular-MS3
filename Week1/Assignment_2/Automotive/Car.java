package Assignment_2.Automotive;

public class Car extends Vehicle {
    private int doors;
    public Car(String name, double speed, int doors) {
        super(name, speed);
        this.doors = doors;
    }
    @Override
    public void move() {
        System.out.println("Vehicle moving!");
    }
}
