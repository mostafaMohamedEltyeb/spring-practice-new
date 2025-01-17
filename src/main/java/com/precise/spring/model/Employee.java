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
    private String department;
    private LocalDate hireDate;
    private double salary;
    private EmployeeStatus employeeStatus;
    private Address address;
}

