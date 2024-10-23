package com.REST.cruddemo.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.REST.cruddemo.Employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
