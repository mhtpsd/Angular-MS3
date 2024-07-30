import java.io.*;
import java.util.*;

class Employee implements Comparable<Employee>, Comparator<Employee> {
    private int empId;
    private String empName;
    private double empBasicSalary;

    Employee() {}

    Employee(int empId, String empName, double empBasicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empBasicSalary = empBasicSalary;
    }

    String getEmpName() {
        return this.empName;
    }
    
    double getEmpBasicSalary() {
        return this.empBasicSalary;
    }

    @Override
    public int compare(Employee arg0, Employee arg1) {
        // comparing double salary
        return Double.compare(arg0.empBasicSalary, arg1.empBasicSalary);
    }

    @Override
    public int compareTo(Employee o) {
        // comparing string names
        return this.empName.compareTo(o.empName);
    }
}

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfEmployees = scan.nextInt();
        ArrayList<Employee> empArrList = new ArrayList<Employee>();
        Employee emp;

        while (noOfEmployees != 0) {
            int empId = scan.nextInt();
            String empName = scan.next();
            double empBasicSalary = scan.nextDouble();
            emp = new Employee(empId, empName, empBasicSalary);
            empArrList.add(emp);
            noOfEmployees--;
        }

        System.out.println("Original List:");
        Iterator<Employee> iter = empArrList.iterator();
        while (iter.hasNext()) { 
            System.out.println(iter.next()); 
        }
        
        displaySortByName(empArrList);
        displaySortBySalary(empArrList);
    }

    static void displaySortByName(ArrayList<Employee> empArrList) {
        Collections.sort(empArrList);
        Iterator<Employee> iter = empArrList.iterator();

        System.out.println("\nList sorted by name in descending order:");
        while (iter.hasNext()) { 
            System.out.println(iter.next()); 
        }
    }

    static void displaySortBySalary(ArrayList<Employee> empArrList) {
        Collections.sort(empArrList, new Employee());
        Iterator<Employee> iter = empArrList.iterator();
        
        System.out.println("\nList sorted by salary in ascending order:");
        while (iter.hasNext()) { 
            System.out.println(iter.next()); 
        }
    }
}