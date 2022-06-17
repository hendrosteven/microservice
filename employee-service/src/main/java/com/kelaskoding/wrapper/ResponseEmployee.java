package com.kelaskoding.wrapper;

import com.kelaskoding.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEmployee {
    private Employee employee;
    private Department department;
}
