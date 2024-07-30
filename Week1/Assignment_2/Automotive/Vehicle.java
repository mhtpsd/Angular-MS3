package Assignment_2.Automotive;

public class Vehicle {
    protected String name;
    protected double speed;
    public Vehicle (String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
    public void move () {
        System.out.println("Vehicle moving!");
    }
}
