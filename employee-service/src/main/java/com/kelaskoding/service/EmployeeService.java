package com.kelaskoding.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kelaskoding.entity.Employee;
import com.kelaskoding.repository.EmployeeRepo;
import com.kelaskoding.wrapper.Department;
import com.kelaskoding.wrapper.ResponseEmployee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private RestTemplate restTemplate;

    public Employee createOne(Employee employee) {
        return repo.save(employee);
    }

    public Employee findOne(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Iterable<Employee> findAll() {
        return repo.findAll();
    }

    public ResponseEmployee findEmployeeWithDepartment(Long id){
        ResponseEmployee response = new ResponseEmployee();
        
        Employee employee = repo.findById(id).orElse(null);
        if(employee == null){
            return null;
        }
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/departments/"+ employee.getDepartmentId(), Department.class);
        response.setEmployee(employee);
        response.setDepartment(department);
        return response;
    }

}
