import java.util.Scanner;

public class SubscriptionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Subscription Checker!");
        
        System.out.print("Enter the number of days left in your  subscription (0-30): ");
        int daysLeft = scanner.nextInt();
        
        if (daysLeft < 0 || daysLeft > 30) {
        System.out.println("Invalid input. Please enter a number between 0 and 30");
        } else {
        if (daysLeft == 0) {
        System.out.println("Your subscription has ended.");
        }
        else if (daysLeft <= 5) {
        System.out.println("Your subscription is about to end.");
        } else if(daysLeft>5){
        System.out.println("Your subscription is active");
        }
        else {
            System.out.println("Goodbye!");
        }
        }
        
        scanner.close();
        
}
}