package com.precise.spring.controller;

import com.precise.spring.model.Employee;
import com.precise.spring.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/api")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }


}
