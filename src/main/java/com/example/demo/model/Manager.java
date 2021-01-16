package com.example.demo.model;

import java.util.UUID;


public final class Manager {
    private final String name;

    private UUID id;
    private int salary;

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Manager() {
        name = "";
    }

    public UUID getId() {
        return id;
    }

    public void work() {
        System.out.println(this.name + " I am working ");
    }

    public String toString() {
        return this.name + " has salary: " + this.salary + "\n";
    }
}
