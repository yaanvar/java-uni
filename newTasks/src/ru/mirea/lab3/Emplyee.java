package ru.mirea.lab3;

import java.util.Scanner;

public class Emplyee {
    String fullname;
    Double salary;

    @Override
    public String toString() {
        String str = String.format("%-15s %15s %n", fullname, salary);
        return str;
    }

    public Emplyee(String fullname, Double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    static void generateReport(Emplyee[] emp) {
        for(int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toString());
        }
    }
}

class TestEmployee {
    public static void main(String[] args){
        Emplyee[] emp = new Emplyee[3];
        emp[0] = new Emplyee("vasya", 15.23);
        emp[1] = new Emplyee("vasya", 15.23);
        emp[2] = new Emplyee("vasya", 15.23);

        Report.generateReport(emp);

    }
}