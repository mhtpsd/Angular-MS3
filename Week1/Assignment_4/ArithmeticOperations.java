package Assignment_4;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter 1st number:");
            String input1 = scan.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.println("Enter 2nd number:");
            String input2 = scan.nextLine();
            int num2 = Integer.parseInt(input2);

            int num3 = num1/num2;
            System.out.println("The result of the division is: " + num3);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occurred: " + ae.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException occurred: " + nfe.getMessage());
        } finally {
            scan.close();
        }
    }
}