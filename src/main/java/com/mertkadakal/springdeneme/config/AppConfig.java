package com.mertkadakal.springdeneme.config;


import com.mertkadakal.springdeneme.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "mert", "kadakal"));
        employees.add(new Employee("2", "melih", "kadakal"));
        employees.add(new Employee("3", "ersin", "kadakal"));
        employees.add(new Employee("4", "ayşe", "yılmaz"));
        employees.add(new Employee("5", "mehmet", "doğan"));
        employees.add(new Employee("6", "zeynep", "çelik"));
        employees.add(new Employee("7", "ahmet", "şahin"));
        employees.add(new Employee("8", "elif", "kaya"));
        employees.add(new Employee("9", "burak", "yıldız"));
        employees.add(new Employee("10", "fatma", "demir"));
        employees.add(new Employee("11", "ali", "koç"));
        employees.add(new Employee("12", "can", "özkan"));
        employees.add(new Employee("13", "emre", "aydın"));
        employees.add(new Employee("14", "gizem", "öztürk"));
        employees.add(new Employee("15", "kerem", "bulut"));
        employees.add(new Employee("16", "berna", "kurt"));
        employees.add(new Employee("17", "cem", "yalçın"));
        employees.add(new Employee("18", "selin", "aksoy"));
        employees.add(new Employee("19", "tolga", "engin"));
        employees.add(new Employee("20", "deniz", "yavuz"));
        return employees;
    }

}
