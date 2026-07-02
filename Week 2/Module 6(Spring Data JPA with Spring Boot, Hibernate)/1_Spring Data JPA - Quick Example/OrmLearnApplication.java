package com.cognizant.orm_learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.repository.DepartmentRepository;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        departmentRepository.save(new Department(1, "IT"));
        departmentRepository.save(new Department(2, "HR"));
        departmentRepository.save(new Department(3, "Finance"));

        List<Department> departments = departmentRepository.findAll();

        System.out.println(">>> Departments in Database:");

        for (Department dept : departments) {
            System.out.println(dept);
        }
    }
}