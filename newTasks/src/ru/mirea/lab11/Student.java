package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    String firstName;
    String secondName;
    String major;
    Date year;
    String group;

    Integer id;

    public Student(String firstName, String secondName, String major, Date year, String group, Integer id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.major = major;
        this.year = year;
        this.group = group;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat();
        String str = dateFormatter.format(year);

        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", major='" + major + '\'' +
                ", year=" + str +
                ", group='" + group + '\'' +
                ", id=" + id +
                '}';
    }
}