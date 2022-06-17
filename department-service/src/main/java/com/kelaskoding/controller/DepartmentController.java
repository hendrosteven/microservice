package com.kelaskoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelaskoding.entity.Department;
import com.kelaskoding.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    
    @Autowired
    private DepartmentService service;

    @PostMapping
    public Department creatOne(@RequestBody Department department){
        return service.createOne(department);
    }

    @GetMapping("/{id}")
    public Department findOne(@PathVariable("id") Long id){
        return service.findOne(id);
    }

    @GetMapping
    public Iterable<Department> findAll(){
        return service.findAll();
    }
}
