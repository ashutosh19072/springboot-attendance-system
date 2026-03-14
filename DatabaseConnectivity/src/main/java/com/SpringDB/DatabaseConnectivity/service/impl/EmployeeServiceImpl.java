package com.SpringDB.DatabaseConnectivity.service.impl;

import com.SpringDB.DatabaseConnectivity.model.Employee;
import com.SpringDB.DatabaseConnectivity.repository.EmployeeRepository;
import com.SpringDB.DatabaseConnectivity.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(int id, Employee employee){
        Employee existing = employeeRepository.findById(id).orElse(null);

        if(existing != null){
            existing.setEmpId(employee.getEmpId());
            return employeeRepository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }

}