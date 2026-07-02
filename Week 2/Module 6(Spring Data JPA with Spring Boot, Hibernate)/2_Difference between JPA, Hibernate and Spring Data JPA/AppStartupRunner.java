package com.example.exerciseemployeecrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class AppStartupRunner implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("John Doe");
        employee.setDepartment("IT");
        employee.setSalary(50000.0);
        employeeService.addEmployee(employee);
        System.out.println("Inserted employee: " + employee);
    }
}