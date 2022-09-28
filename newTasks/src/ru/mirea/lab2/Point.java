package ru.mirea.lab2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/*
Создать класс точка Point, описывающий точку на плоскости.
Создать Circle класс, в котором одно поле представляет точку – центр окружности, и добавить другие свойства,
позволяющие задать точку на плоскости. Создать третий класс Tester который использует для хранения объектов
массив объектов Circle и второе поле количество элементов в массиве.
*/

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class TestPointAndCircle {
    public static void test() {
        Point centerPoint = new Point(12.4, -3.4);
        Circle smallCircle = new Circle(5, centerPoint);
        System.out.println(smallCircle.getRadius());
        Scanner scan = new Scanner(System.in);
        int newRadius = scan.nextInt();
        smallCircle.setRadius(newRadius);
        System.out.println(smallCircle.getRadius());
    }
}


