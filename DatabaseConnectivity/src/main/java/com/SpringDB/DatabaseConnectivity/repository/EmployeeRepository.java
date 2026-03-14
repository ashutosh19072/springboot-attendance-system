package com.SpringDB.DatabaseConnectivity.repository;

import com.SpringDB.DatabaseConnectivity.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}