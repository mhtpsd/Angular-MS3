import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

public class IntegerListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter integers (enter -1 to stop)");
        List<Integer> tempList = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            tempList.add(number);
        }

        Set<Integer> uniqueNumbers = new HashSet<>(tempList);

        System.out.println("List without duplicates:");
        System.out.println(uniqueNumbers);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Search for a number");
            System.out.println("2. Exit");
            System.out.println("Enter your choice");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter a number to search: ");
                int searchNumber = scanner.nextInt();

                if (uniqueNumbers.contains(searchNumber)) {
                    System.out.println(searchNumber + " exists in the list. Do you want to remove it? (y/n)");
                    char removeChoice = scanner.next().charAt(0);
                    if (removeChoice == 'y') {
                        uniqueNumbers.remove(searchNumber);
                        System.out.println(searchNumber + " removed from list.");
                    }
                } else {
                    System.out.println(searchNumber + " does not exists in the list. Do you want to add it. (y/n)");
                    char addChoice = scanner.next().charAt(0);
                    if (addChoice == 'y' || addChoice == 'Y') {
                        uniqueNumbers.add(searchNumber);
                        System.out.println(searchNumber + " added to the list.");
                    }
                }
             } else if (choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid Choice.");
                }
        }
        System.out.println("\nFinal list:");
        System.out.println(uniqueNumbers);

        scanner.close();
    }
}