package ru.mirea.lab3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DoubleShell {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //Создайте объекты класса Double, используя методы valueOf().
        Double db = new Double("6.5");
        System.out.println("Value = " +  db.valueOf(str));

        //Преобразовать значение типа String к типу double. Используем
        //метод Double.parseDouble().
        str = scanner.nextLine();
        double val = Double.parseDouble(str);
        System.out.println("Value = " + val);

        //Преобразовать объект класса Double ко всем примитивным типам.
        double d = 56.7809;
        String s = Double.toString(d);
        Integer i = (int) d;

        //Вывести значение объекта Double на консоль.
        System.out.println(Double.toString(d));

        //реобразовать литерал типа double к строке:
        String str_d = Double.toString(3.14);
    }
}
