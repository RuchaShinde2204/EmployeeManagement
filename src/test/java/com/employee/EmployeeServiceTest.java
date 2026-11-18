package com.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    @Test
    public void testAddEmployee() {

        EmployeeService service = new EmployeeService();

        service.addEmployee(
            new Employee(101, "Riya", "IT", 35000)
        );

        assertEquals(1, service.getAllEmployees().size());
    }

    @Test
    public void testFindEmployee() {

        EmployeeService service = new EmployeeService();

        service.addEmployee(
            new Employee(101, "Riya", "IT", 35000)
        );

        assertNotNull(service.findEmployee(101));
    }

    @Test
    public void testDeleteEmployee() {

        EmployeeService service = new EmployeeService();

        service.addEmployee(
            new Employee(101, "Riya", "IT", 35000)
        );

        assertTrue(service.deleteEmployee(101));

        assertEquals(0, service.getAllEmployees().size());
    }
}