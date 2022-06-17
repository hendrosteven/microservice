package com.kelaskoding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelaskoding.entity.Department;
import com.kelaskoding.repository.DepartmentRepo;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepo repo;

    public Department createOne(Department department){
        return repo.save(department);
    }

    public Department findOne(Long id){
        return repo.findById(id).orElse(null);
    }

    public Iterable<Department> findAll(){
        return repo.findAll();
    }
}
