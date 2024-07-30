package Hashmap;

public class Employee implements Comparable<Employee> {
    private int employeeID;
    private String name;
    private String grade;

    public Employee(int employeeID, String name, String grade) {
        this.employeeID = employeeID;
        this.name = name;
        this.grade = grade;
    }
	//create getter and setter

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Employee arg0) {
        // TODO Auto-generated method stub
       return this.getName().compareTo(arg0.getName());
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Mohit", "Agrade");
        System.out.println(employee.getName());
        EmployeeManagement empMa = new EmployeeManagement();
        empMa.addEmployee(employee);
        System.out.println(empMa.getAllEmployeesSortedByName());
        
        empMa.removeEmployee(1);
    }

    
    
	}
	