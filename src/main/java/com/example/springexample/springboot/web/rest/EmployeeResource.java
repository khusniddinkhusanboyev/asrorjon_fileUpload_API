package com.example.springexample.springboot.web.rest;

import com.example.springexample.springboot.domain.Employee;
import com.example.springexample.springboot.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
    EmployeeService employeeService;
    
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity create(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);

    }

    @GetMapping("/employees")
    public ResponseEntity findAll() {
        List<Employee> employees = employeeService.findAll();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity findByName(@PathVariable String name) {
        List<Employee> employees = employeeService.findByName(name);
        return ResponseEntity.ok(employees);
    }
}
