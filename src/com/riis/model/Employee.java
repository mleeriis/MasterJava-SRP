package com.riis.model;

public class Employee {
    long id;
    String name;
    String department;
    boolean working;

    public Employee(long id, String name, String department, boolean working){
        this.id = id;
        this.name = name;
        this.department = department;
        this. working = working;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
