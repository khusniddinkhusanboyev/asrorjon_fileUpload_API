package com.example.springexample.springboot.service;

import com.example.springexample.springboot.domain.Employee;
import com.example.springexample.springboot.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository repository) {
        this.employeeRepository = repository;
    }
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id){
        return employeeRepository.findById(id).get();
    }
    public List<Employee> findByName(String name){
        return employeeRepository.findAllByNameLike(name);

    }

}
