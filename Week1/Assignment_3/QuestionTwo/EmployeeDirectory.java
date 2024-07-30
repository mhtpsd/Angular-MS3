package QuestionTwo;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDirectory<T extends Employee> {
    private Set<T> employees;

    public EmployeeDirectory() {
        this.employees = new HashSet<>();
    }

    public void addEmployee(T employee) {
        employees.add(employee);
    }

    public void removeEmployee(T employee) {
        employees.remove(employee);
    }

    public Set<T> getEmployees() {
        return employees;
    }

    public static void main(String[] args) {
        
        EmployeeDirectory<Employee> directory = new EmployeeDirectory<>();

        
        Employee emp1 = new Employee(1, "Alice", "Engineer");
        Employee emp2 = new Employee(2, "Bob", "Manager");

        
        directory.addEmployee(emp1);
        directory.addEmployee(emp2);

        
        for (Employee emp : directory.getEmployees()) {
            System.out.println("ID: " + emp.getEmployeeID() + ", Name: " + emp.getName() + ", Role: " + emp.getRole());
        }

        
        directory.removeEmployee(emp1);

        
        System.out.println("After removal:");
        for (Employee emp : directory.getEmployees()) {
            System.out.println("ID: " + emp.getEmployeeID() + ", Name: " + emp.getName() + ", Role: " + emp.getRole());
        }
    }
}
 