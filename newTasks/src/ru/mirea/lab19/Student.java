package ru.mirea.lab19;

public class Student {
    private String name;
    private Double mark;

    public Student(String name, Double mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }

    public String toString() {
        return name + ": " + mark;
    }
}