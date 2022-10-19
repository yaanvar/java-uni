package ru.mirea.lab13;

public class Person {
    String firstName;
    String lastName;
    String fathersName;

    public Person(String firstName, String lastName, String fathersName) {
        if(firstName == null) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }

        if(lastName == null) {
            this.firstName = "";
        } else {
            this.firstName = lastName;
        }

        if(fathersName == null) {
            this.firstName = "";
        } else {
            this.firstName = fathersName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFathersName() {
        return fathersName;
    }

    void fullNameOut() {
        System.out.println(getLastName() + " " + getFirstName() + " " + getFathersName());
    }


}
