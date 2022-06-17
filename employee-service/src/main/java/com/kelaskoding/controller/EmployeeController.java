package com.kelaskoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelaskoding.entity.Employee;
import com.kelaskoding.service.EmployeeService;
import com.kelaskoding.wrapper.ResponseEmployee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee createOne(@RequestBody Employee employee){
        return service.createOne(employee);
    }

    @GetMapping("/{id}")
    public Employee findOne(@PathVariable("id") Long id){
        return service.findOne(id);
    }

    @GetMapping
    public Iterable<Employee> findAll(){
        return service.findAll();
    }

    @GetMapping("/detail/{id}")
    public ResponseEmployee findEmployeeWithDepartment(@PathVariable("id") Long id){
        return service.findEmployeeWithDepartment(id);
    }
}
