package ru.mirea.lab8;

import java.util.Random;
import java.util.Scanner;

public class Recursion {

    public static boolean isPal(String s) {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));
        return false;
    }

    public static void reverse(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10);
            reverse(num / 10);
        }
    }



    public static void main(String[] args){
        // Задание Треугольная последовательность
        System.out.println("Triangle Sequence");
        int n = 0, k = 1, j = 1;
        System.out.println("Input n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            System.out.printf(String.valueOf(k) + " ");
            if (j == k) {
                ++k;
                j = 1;
            } else {
                ++j;
            }
        }

        // Задание палиндром
        System.out.println("\nPalindrom");
        String str = "tenet";

        if (isPal(str)) {
            System.out.println(str + " is palindrom");
        } else {
            System.out.println(str + " is not palindrom");
        }
        // Задание разворот числа
        System.out.println("Number Reverse");
        System.out.println("Input number: ");
        Integer num = sc.nextInt();
        reverse(num);
    }
}
