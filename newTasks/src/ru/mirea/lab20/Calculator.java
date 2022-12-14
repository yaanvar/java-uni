package ru.mirea.lab20;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }


    public static void main(String[] args) {
        printAllResults(
                new double[]{
                        Calculator.divide(54, 15),
                        Calculator.sum(5, 1.6),
                        Calculator.multiply(10.6, 29.8),
                        Calculator.subtraction(13.7, 15)
                }
        );
    }

    public static void printAllResults(double[] results) {
        for (double result : results) {
            System.out.println("result = " + result + ";");
        }
    }
}