package com.kelaskoding.repository;

import org.springframework.data.repository.CrudRepository;

import com.kelaskoding.entity.Department;

public interface DepartmentRepo extends CrudRepository<Department, Long>{
    
}
