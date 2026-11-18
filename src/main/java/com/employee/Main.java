package com.employee;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        service.addEmployee(
            new Employee(101, "Riya", "IT", 35000)
        );

        service.addEmployee(
            new Employee(102, "Priya", "HR", 40000)
        );

        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");

        System.out.println("\nEmployee Details:");

        for (Employee emp : service.getAllEmployees()) {
            System.out.println(emp);
        }

        System.out.println("\nSearching Employee ID 101:");

        Employee employee = service.findEmployee(101);

        if (employee != null) {
            System.out.println(employee);
        }

        System.out.println("\nDeleting Employee ID 102:");

        System.out.println(
            service.deleteEmployee(102)
            ? "Employee deleted successfully"
            : "Employee not found"
        );

        System.out.println("\nFinal Employee List:");

        for (Employee emp : service.getAllEmployees()) {
            System.out.println(emp);
        }
    }
}