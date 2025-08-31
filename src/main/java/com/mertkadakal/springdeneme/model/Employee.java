package com.mertkadakal.springdeneme.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    public String id;
    public String name;
    public String surname;

    public Employee(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
