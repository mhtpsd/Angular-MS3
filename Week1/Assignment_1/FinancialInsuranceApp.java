import java.util.Scanner;

public class FinancialInsuranceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            displayMenu();
            choice = scanner.nextInt();

            switch(choice) {
            case 1:
                calculatePremium();
                break;
            case 2:
                calculateMaturityAmount();
                break;
            case 3:
                convertToUpperCase();
                break;
            case 4:
                convertToLowerCase();
                break;
            case 5:
                break;
            default:
            System.out.println("Invalid choice. Please try again.");
        }
    }while (choice!=5);
    scanner.close();
    }
    private static void displayMenu() {
        System.out.println("\nFinancial Insurance App");
        System.out.println("1. Premium Calculation");
        System.out.println("2. Maturity Amount Calculation");
        System.out.println("3. Convert Policy Details to Upper Case");
        System.out.println("4. Convert Policy Details to Lower Case");
        System.out.println("5. Exit");
        System.out.print("Enter your Choice: ");
    }
    
    private static void calculatePremium() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter sum assured: ");
        double sumAssured = scanner.nextDouble();

        double premium;

        if(age<25) {
            premium = sumAssured*0.05;
        } else if(age>= 25 && age<=40) {
            premium = sumAssured*0.10;
        } else {
            premium = sumAssured*0.20;
        }
        System.out.println("Premium : "+ premium);
    }
    
    private static void calculateMaturityAmount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter premium amount: ");
        double premium = scanner.nextDouble();

        System.out.println("Enter policy term amount: ");
        int term = scanner.nextInt();

        System.out.println("Enter annual interest rate (%): ");
        double interrestRate = scanner.nextDouble();

        double maturityAmount = premium*term*(1+interrestRate/100);
        System.out.println("Maturity Amount: " + maturityAmount);
    }

    private static void convertToUpperCase() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter policy details: ");
        String details = scanner.nextLine();

        System.out.print("Converted to upper case: " + details.toUpperCase());
    }
    
    private static void convertToLowerCase() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter policy details: ");
        String details = scanner.nextLine();

        System.out.print("Converted to lower case: " + details.toLowerCase());
    }
    
}