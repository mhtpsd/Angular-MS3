package Hashmap;

import java.util.*;

public class EmployeeManagement {
    private Map<Integer, Employee> employeeMap;

    public EmployeeManagement() {
        //Write a missing code here
        employeeMap = new HashMap<Integer, Employee>();
    }

    public void addEmployee(Employee employee) {
         //Write a missing code here
         employeeMap.put(employee.getEmployeeID(), employee);
    }

    public Employee getEmployee(int employeeID) {
        //Write a missing code here
        return employeeMap.get(employeeID);
    }

    public List<Employee> getAllEmployeesSortedByName() {
         //Write a missing code here
         List<Employee> arrList = new ArrayList<>(employeeMap.values());
         Collections.sort(arrList);
         return arrList;
        // for ( Map.entry(Integer, Employee) mp: arrList) {}
            
         }

    public boolean removeEmployee(int employeeID) {
        //Write a missing code here
        return employeeMap.remove(employeeID) != null;
    }
}