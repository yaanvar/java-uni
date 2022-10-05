package ru.mirea.lab3;

import java.util.*;

/*
Пользователь должен ввести с клавиатуры размер массива -
натуральное число больше, так чтобы введенное пользователем число сохранялось в переменную n.
Если пользователь ввел не подходящее число, то программа должна просить пользователя повторить ввод.
Создать массив из n случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
массив только из четных элементов первого массива, если они там есть, и вывести его на экран.
*/

public class EvenRandomArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();

        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        ArrayList<Object> evenArray = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < sizeOfArray; i++) {
            randomArray.add(rand.nextInt(0, sizeOfArray));
        }

        System.out.println("array:");
        for(int i = 0; i < randomArray.size(); i++) {
            System.out.println(randomArray.toArray()[i]);
            if (randomArray.get(i) % 2 == 0) {
                evenArray.add(randomArray.get(i));
            }
        }



        System.out.println("even array:");
        for(int i = 0; i < evenArray.size(); i++) {
            System.out.println(evenArray.toArray()[i]);
        }

    }
}
