package ru.mirea.lab2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


/*
По диаграмме класса UML описывающей сущность Автор.
Необходимо написать программу, которая состоит из двух классов Author и TestAuthor.
*/

public class Author {
    String name;
    String email;
    Character gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    Character getGender() {
        return gender;
    }

    void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{"
                + "name='" + name + '\''
                + ", email=" + email + '\''
                + ", gender=" + gender
                + '}';
    }
}

class TestAuthor {
    public void test() {
        Author author = new Author("Franz", "franz_kafka@gmail.com", 'M');
        System.out.println(author.getName());
        Scanner scan = new Scanner(System.in);
        String newEmail = scan.nextLine();
        author.setEmail(newEmail);
        System.out.println(author.getEmail());
    }
}
