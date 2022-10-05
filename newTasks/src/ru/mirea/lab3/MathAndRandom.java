package ru.mirea.lab3;
import java.util.*;

/*
Создать массив вещественных чисел случайным образом, вывести его на экран,
отсортировать его, и снова вывести на экран (использовать два подхода к генерации случайных чисел –
метод random() класса Math и класс Random)
*/

public class MathAndRandom {
    public static void main(String[] args){
        Double[] randomArray = new Double[10];
        Random rand = new Random();

        for(int i = 0; i < 10; i++) {
            randomArray[i] = rand.nextDouble();
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

    }
}
