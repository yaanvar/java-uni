package ru.mirea.lab17;

public class Employee {
    private String name;
    private int id;
    private int salary;
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}