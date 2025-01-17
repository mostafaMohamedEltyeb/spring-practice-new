package com.precise.spring.model;

import com.precise.spring.Enum.EmployeeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String jobTitle;
    private Department department;
    private LocalDate hireDate;
    private double salary;
    private EmployeeStatus employeeStatus;
    private Address address;


    //todo confirm of past understanding done
    //todo how to clone the project from git hub
    //todo new object from employee class
    //todo make static method have 10 employees
    //todo make 2 methods 1 to get all employees 2 method take name as input and search
}

