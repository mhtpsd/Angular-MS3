// Employee.java
package QuestionTwo;

import java.util.Objects;

public class Employee {
    private int employeeID;
    private String name;
    private String role;

    public Employee(int employeeID, String name, String role) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
    }

    
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }
}

