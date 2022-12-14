package ru.mirea.lab19;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException() {
        super("Student not found");
    }
}