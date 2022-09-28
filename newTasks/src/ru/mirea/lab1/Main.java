package ru.mirea.lab1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main
{


    public static long factorial(int n) {
        long number = 1;
        for (int i = 2; i <= n; i++) {
            number = number * i;
        }
        return number;
    }

    public static void main(String[] args) {
        /*
        Написать программу, в результате которой массив чисел создается с
        помощью инициализации (как в Си) вводится и считается в цикле сумма элементов целочисленного массива,
        а также среднее арифметическое его элементов результат выводится на экран. Использовать цикл for.
         */

        System.out.println("Enter 10 new values for your array: ");
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);

        int sumOfArray = 0;
        for(int i = 0; i < 10; i++) {
            int temp = scan.nextInt();
            array[i] = temp;
            sumOfArray += temp;
        }

        int average = sumOfArray / array.length;

        System.out.println("Sum of numbers = " + sumOfArray);
        System.out.println("Average = " + average);

        /*
        Написать программу, в результате которой массив чисел вводится пользователем с
        клавиатуры считается сумма элементов целочисленного массива с помощью циклов do
        while, также необходимо найти максимальный и минимальный элемент в массиве,
        результат выводится на экран.
         */

        System.out.println("Enter 10 new values for your array: ");

        int j = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        do {
            int temp = scan.nextInt();
            array[j] = temp;

            min = Integer.min(min, temp);
            min = Integer.max(min, temp);
            j++;
        } while (j < 10);

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);


        /*
       Написать программу, в результате которой выводятся на экран аргументы командной строки в цикле for.
        */

        for (int z = 0; z < args.length; z++) {
            System.out.println(args[z]);
        }


        /*
        Написать программу, в результате работы которой выводятся на экран первые 10
        чисел гармонического ряда (форматировать вывод).
        */

        System.out.println("Harmonic series:");
        for(int i = 1; i <= 10; i++) {
            double number = 1. / i;
            System.out.printf("%d. %,.3f\n", i, number);
        }

        /*
        Написать программу, которая с помощью метода класса, вычисляет факториал
        числа (использовать управляющую конструкцию цикла), проверить работу метода.
         */

        System.out.println("Enter a number to see its factorial:");
        int factorialNumber = scan.nextInt();
        System.out.printf("%d factorial is %d", factorialNumber, factorial(factorialNumber));

    }
}
