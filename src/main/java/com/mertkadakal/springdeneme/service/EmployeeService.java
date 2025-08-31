package com.mertkadakal.springdeneme.service;


import com.mertkadakal.springdeneme.model.Employee;
import com.mertkadakal.springdeneme.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getEmployee() {
        return repository.getEmployee();
    }

    //PATHVARIABLE
    public Employee getEmployeeById(String id) {
        return repository.getEmployeeById(id);
    }

    //REQUESTPARAM
    public List<Employee> getEmployeeWithParams(String name, String surname) {
        return repository.getEmployeeWithParams(name, surname);
    }

    //REQUESTBODY
    public Employee addEmployee(Employee employee) {
        return repository.addEmployee(employee);
    }

    //DELETE
    public Employee deleteEmployee(Employee employee) {
        return repository.deleteEmployee(employee);
    }

    //UPDATE/PUT
    public Employee updateEmployee(Employee oldEmp, Employee newEmp) {
        return repository.updateEmployee(oldEmp, newEmp);
    }
}
