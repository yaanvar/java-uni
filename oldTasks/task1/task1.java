package ru.mirea.task1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class task1
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
        Разработайте программу, в результате работы которой считается сумма
        элементов целочисленного массива с помощью циклов for, while, do while,
        результат выводится на экран.
         */

        /*
        Разработайте программу, в результате работы которой выводятся
        на экран аргументы командной строки в цикле for.
        */

        System.out.println("Enter 10 new values for your array: ");

        int[] array = new int[10];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            int temp = scan.nextInt();
            array[i] = temp;
        }

        int sizeOfArray = array.length;
        int sum = 0;
        while(sizeOfArray > 0) {
            sizeOfArray--;
            sum += array[sizeOfArray];
        }

        System.out.println("Sum of numbers = " + sum);

        sizeOfArray = array.length;
        sum = 0;
        do {
            sizeOfArray--;
            sum += array[sizeOfArray];
        } while(sizeOfArray > 0);

        System.out.println("Sum of numbers = " + sum);

        /*
        Разработайте программу, в результате работы
        которой выводятся на экран первые 10 чисел гармонического ряда (форматируйте вывод).
         */

        System.out.println("Harmonic series:");
        for(int i = 1; i <= 10; i++) {
            double number = 1. / i;
            System.out.printf("%d. %,.3f\n", i, number);
        }

        /*
        Разработайте программу, в результате работы которой генерируется
        массив целых чисел случайным образом,
        выведите его на экран, отсортируйте, и снова выведит
        на экран (используйте два подхода к генерации случайных
        чисел – метод random() класса Math и класс Random).
        */

        int[] randomArray = new int[10];
        Random rand = new Random();

        for(int i = 0; i < 10; i++) {
            randomArray[i] = rand.nextInt();
        }

        System.out.println("before sorting:");
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", randomArray[i]);
        }

        Arrays.sort(randomArray);

        System.out.println("\nafter sorting:");
        for(int i = 0; i < 10; i++) {
            System.out.printf("%d ", randomArray[i]);
        }
        System.out.println();

        /*
        Разработайте программу, которая будет с помощью
        метода вычислять факториал числа (используйте управляющую конструкцию цикла), проверьте работу метода.
        */

        System.out.println("Enter a number to see its factorial:");
        int factorialNumber = scan.nextInt();
        System.out.printf("%d factorial is %d", factorialNumber, factorial(factorialNumber));
    }
}
