package com.example.demo.controller;

import com.example.demo.bean.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class EmployeeController {
    @RequestMapping("/getAllEmployeeList")
    public List<Employee> getemployeeList() {
        List<Employee> employeeList = new ArrayList<Employee>();
        var emp1 = new Employee("varun", "1", "indore", "varun@gmail.com");
        var emp2 = new Employee("test", "2", "indore", "test@gmail.com");
        employeeList.add(emp1);
        employeeList.add(emp2);
        return employeeList;
    }
}
