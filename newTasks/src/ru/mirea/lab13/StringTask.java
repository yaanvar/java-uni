package ru.mirea.lab13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StringTask {

    static void string_func(String str) {
        System.out.println(str.charAt(str.length() - 1));

        if(str.endsWith("!!!")) {
            System.out.println("String ends with !!!");
        } else {
            System.out.println("String doesn't end with !!!");
        }


        if(str.contains("Java")) {
            System.out.println("String contains Java");
        } else {
            System.out.println("String doesn't contain Java");
        }

        if(str.startsWith("I like")) {
            System.out.println("String starts with I like");
        } else {
            System.out.println("String doesn't start with I like");
        }

        System.out.println(str.indexOf("Java"));

        System.out.println(str.replaceAll("a", "o"));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.replace("Java", ""));
    }

    public static void main(String[] args) throws ParseException {
        string_func("I like Java!!!");


    }
}
