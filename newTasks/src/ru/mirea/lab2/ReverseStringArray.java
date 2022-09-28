package ru.mirea.lab2;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {
    public static void reverseArray(String[] array) {
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            String temp = array[left];
            array[left]  = array[right];
            array[right] = temp;
        }
        System.out.print("Reversed array :");
        for(String word : array) {
            System.out.print(" " + word);
        }
    }
}
