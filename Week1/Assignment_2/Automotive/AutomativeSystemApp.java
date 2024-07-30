package Assignment_2.Automotive;

public class AutomativeSystemApp {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", 60.0, 4);
        car1.move();

        Car car2 = new Car("Car2", 70.0, 2);
        car2.move();
    }
}
