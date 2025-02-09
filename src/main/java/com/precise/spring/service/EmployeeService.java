package com.precise.spring.service;

import com.precise.spring.data.EmployeeData;
import com.precise.spring.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    public List<Employee> getAllEmployees() {
        return EmployeeData.getEmployees();
    }

    public Employee getEmployeeById(int id) {
        return EmployeeData.getEmployeeById(id);
    }


}
