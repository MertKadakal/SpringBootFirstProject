package com.mertkadakal.springdeneme.repository;

import com.mertkadakal.springdeneme.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @Autowired
    public List<Employee> employees;

    public List<Employee> getEmployee() {
        return employees;
    }

    //PATHVARIABLE
    public Employee getEmployeeById(String id) {
        Employee findemployee = null;
        for (Employee employee : employees) {
            if (employee.id.equals(id)) {
                findemployee = employee;
                break;
            }
        }
        return findemployee;
    }

    //REQUESTPARAM
    public List<Employee> getEmployeeWithParams(String name, String surname) {
        List<Employee> foundEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (name == null && surname == null) {
                continue;
            }
            if (name != null && surname != null) {
                if (employee.name.equals(name) && employee.surname.equals(surname)) {
                    foundEmployees.add(employee);
                }
            }
            if (name != null && surname == null) {
                if (employee.name.equals(name)) {
                    foundEmployees.add(employee);
                }
            }
            if (name == null && surname != null) {
                if (employee.surname.equals(surname)) {
                    foundEmployees.add(employee);
                }
            }
        }

        return foundEmployees;
    }

    //REQUESTBODY
    public Employee addEmployee(Employee employee) {
        int maxId = employees.stream()
                .mapToInt(e -> {
                    try {
                        return Integer.parseInt(e.id);
                    } catch (NumberFormatException ex) {
                        return 0; // id'si sayı değilse 0 kabul et
                    }
                })
                .max()
                .orElse(0);

        int newId = maxId + 1;
        employee.id = String.valueOf(newId);

        employees.add(employee);
        return employee;
    }


    //DELETE
    public Employee deleteEmployee(Employee employee) {
        employees.remove(employee);
        return employee;
    }

    //UPDATE/PUT
    public Employee updateEmployee(Employee oldEmp, Employee newEmp) {
        int index = employees.indexOf(oldEmp);
        if (index == -1) {
            return null;
        }
        employees.set(index, newEmp);
        return newEmp;
    }
}
