package com.SpringDB.DatabaseConnectivity.service;

import com.SpringDB.DatabaseConnectivity.model.Employee;
import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    Employee updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);

}