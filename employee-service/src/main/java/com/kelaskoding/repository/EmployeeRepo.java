package com.kelaskoding.repository;

import org.springframework.data.repository.CrudRepository;

import com.kelaskoding.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long>{
    
}
