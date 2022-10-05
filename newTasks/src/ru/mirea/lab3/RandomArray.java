package ru.mirea.lab3;

import java.util.*;

/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку,
далее определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
*/

public class RandomArray {
    public static void main(String[] args){
        Double[] randomArray = new Double[4];
        Random rand = new Random();

        for(int i = 0; i < 4; i++) {
            randomArray[i] = rand.nextDouble(10, 99);
        }

        for(int i = 0; i < 4; i++) {
            System.out.println(randomArray[i]);
        }

        boolean isIncreasing = true;

        for (int i = 1; i < 4; i++) {
            if (randomArray[i] <= randomArray[i - 1]) {
                isIncreasing = false;
            }
        }

        if (isIncreasing) {
            System.out.println("Sequence is increasing");
        } else {
            System.out.println("Sequence is not increasing");
        }

    }
}
