package ru.mirea.lab18;

import java.util.Scanner;

public class task4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Could not convert to int");
        } finally {
            System.out.println("This is the finally block");
        }
    }

    public static void main(String[] args) {
        task4 t = new task4();
        t.exceptionDemo();
    }
}