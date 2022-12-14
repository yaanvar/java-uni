package ru.mirea.lab17;

public class EmployeeView {
    public void printEmployeeDetails(String name, int id, int salary) {
        System.out.println("Employee:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}