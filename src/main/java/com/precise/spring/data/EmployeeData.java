package com.precise.spring.data;

import com.precise.spring.Enum.EmployeeStatus;
import com.precise.spring.model.Address;
import com.precise.spring.model.Department;
import com.precise.spring.model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {


    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        Department itDepartment = new Department(101, "IT", "Information Technology Department", "Cairo Office");
        Department hrDepartment = new Department(102, "HR", "Human Resources Department", "Alexandria Office");
        Department financeDepartment = new Department(103, "Finance", "Finance Department", "Riyadh Office");

        employees.add(new Employee(1, "أحمد", "محمد", "ahmed.mohamed@example.com", "123-456-7890", "Software Engineer",
                itDepartment, LocalDate.of(2020, 1, 15), 75000, EmployeeStatus.ACTIVE,
                new Address("123 Main St", "Cairo", "Cairo Governorate", "11211", "Egypt")));

        employees.add(new Employee(2, "خالد", "علي", "khaled.ali@example.com", "987-654-3210", "Project Manager",
                itDepartment, LocalDate.of(2018, 5, 23), 95000, EmployeeStatus.ACTIVE,
                new Address("456 Elm St", "Alexandria", "Alexandria Governorate", "21500", "Egypt")));

        employees.add(new Employee(3, "محمد", "عبدالله", "mohamed.abdullah@example.com", "555-123-4567", "HR Specialist",
                hrDepartment, LocalDate.of(2019, 3, 10), 60000, EmployeeStatus.LEAVE,
                new Address("789 Oak St", "Riyadh", "Riyadh Province", "12345", "Saudi Arabia")));

        employees.add(new Employee(4, "علي", "حسن", "ali.hassan@example.com", "444-567-8901", "Accountant",
                financeDepartment, LocalDate.of(2021, 11, 5), 55000, EmployeeStatus.ACTIVE,
                new Address("321 Maple Ave", "Jeddah", "Makkah Province", "54321", "Saudi Arabia")));

        employees.add(new Employee(5, "يوسف", "صالح", "youssef.salah@example.com", "333-678-9012", "Software Developer",
                itDepartment, LocalDate.of(2017, 7, 19), 70000, EmployeeStatus.ACTIVE,
                new Address("654 Pine St", "Cairo", "Cairo Governorate", "11212", "Egypt")));

        employees.add(new Employee(6, "عمرو", "فتحي", "amr.fathy@example.com", "222-789-0123", "HR Manager",
                hrDepartment, LocalDate.of(2016, 4, 12), 85000, EmployeeStatus.ACTIVE,
                new Address("987 Cedar Rd", "Alexandria", "Alexandria Governorate", "21501", "Egypt")));

        employees.add(new Employee(7, "سعيد", "أحمد", "saeed.ahmed@example.com", "111-890-1234", "Finance Analyst",
                financeDepartment, LocalDate.of(2019, 9, 15), 50000, EmployeeStatus.ACTIVE,
                new Address("123 Birch Ln", "Riyadh", "Riyadh Province", "54322", "Saudi Arabia")));

        employees.add(new Employee(8, "محمود", "إبراهيم", "mahmoud.ibrahim@example.com", "999-012-3456", "IT Support Specialist",
                itDepartment, LocalDate.of(2020, 8, 30), 40000, EmployeeStatus.LEAVE,
                new Address("456 Walnut St", "Cairo", "Cairo Governorate", "11213", "Egypt")));

        employees.add(new Employee(9, "إبراهيم", "خالد", "ibrahim.khaled@example.com", "888-123-4567", "HR Coordinator",
                hrDepartment, LocalDate.of(2022, 1, 20), 45000, EmployeeStatus.ACTIVE,
                new Address("789 Ash St", "Alexandria", "Alexandria Governorate", "21502", "Egypt")));

        employees.add(new Employee(10, "عبدالرحمن", "سامي", "abdelrahman.samy@example.com", "777-234-5678", "Finance Manager",
                financeDepartment, LocalDate.of(2015, 6, 18), 120000, EmployeeStatus.ACTIVE,
                new Address("321 Chestnut St", "Jeddah", "Makkah Province", "54323", "Saudi Arabia")));

        return employees;
    }


    public static Employee findEmployeeByFistName(String firstName) {
        for (Employee employee : getEmployees()) {
           if(employee.getFirstName().equals(firstName)) {
               return employee;
           }
        }
        return new Employee();
    }


    public static Employee findEmployeeByLastName(String lastName) {
        for (Employee employee : getEmployees()) {
            if(employee.getLastName().equals(lastName)) {
                return employee;
            }
        }
        return new Employee();
    }

}
