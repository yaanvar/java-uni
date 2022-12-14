package ru.mirea.lab20;

import java.util.Arrays;
import java.util.Random;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMinElement() {
        if (array.length > 0) {
            T min = array[0];
            for (T t : array) {
                if (t.compareTo(min) < 0) {
                    min = t;
                }
            }
            return min;
        }
        return null;
    }

    public T getMaxElement() {
        if (array.length > 0) {
            T max = array[0];
            for (T t : array) {
                if (t.compareTo(max) > 0) {
                    max = t;
                }
            }
            return max;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MinMax <" + array.getClass().getSimpleName() + "> " + Arrays.toString(array);
    }

    public static void printMinMaxInfo(MinMax<?> array) {
        System.out.println(array);
        System.out.println("Минимальный элемент - '" + array.getMinElement() + '\'');
        System.out.println("Максимальный элемент - '" + array.getMaxElement() + '\'');
    }

    public static void main(String[] args) {
        MinMax<Character> aChar = new MinMax<>(new Character[]{'c', 'h', 'w', 'o'});
        printMinMaxInfo(aChar);
        System.out.println();

        MinMax<Integer> aInt = new MinMax<>(new Integer[]{
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100),
                new Random().nextInt(100)
        });
        printMinMaxInfo(aInt);
        System.out.println();

        MinMax<Double> aDouble = new MinMax<>(new Double[]{68.54, 71.75, 19.21, 7.88});
        printMinMaxInfo(aDouble);
    }
}