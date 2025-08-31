package com.mertkadakal.springdeneme.controller;

import com.mertkadakal.springdeneme.model.Employee;
import com.mertkadakal.springdeneme.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // tüm listeyi alma
    @GetMapping(path = "/list")
    public List<Employee> getEmployee() {
        return service.getEmployee();
    }

    //PATHVARIABLE
    @GetMapping(path = "/list/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return service.getEmployeeById(id);
    }

    //REQUESTPARAM
    @GetMapping(path = "/with-params/")
    public List<Employee> getEmployeeWithParams(@RequestParam(required = false) String name, @RequestParam(required = false) String surname) {
        return service.getEmployeeWithParams(name, surname);
    }

    //REQUESTBODY
    @PostMapping(path = "/save/")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    //DELETE
    @DeleteMapping(path = "/delete/{id}")
    public Employee deleteEmployee(@PathVariable String id) {
        return service.deleteEmployee(service.getEmployeeById(id));
    }

    //PUT
    @PutMapping(path = "/update/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        return service.updateEmployee(service.getEmployeeById(id), employee);
    }
}
