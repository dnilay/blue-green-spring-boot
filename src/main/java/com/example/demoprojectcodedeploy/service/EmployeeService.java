package com.example.demoprojectcodedeploy.service;

import com.example.demoprojectcodedeploy.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);
    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(int employeeId );
}
