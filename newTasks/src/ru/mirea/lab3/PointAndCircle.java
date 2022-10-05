package ru.mirea.lab3;

import java.util.Scanner;

/*
Создать класс точка Point, описывающий точку на плоскости. Создать Circle класс, в котором одно поле
представляет точку – центр окружности, и добавить другие свойства, позволяющие задать точку на плоскости.
Создать третий класс Tester который использует для хранения объектов массив объектов Circle и второе поле
количество элементов в массиве. Добавить в класс методы, позволяющие найти самую маленькую и самую большую окружность.
Добавить в класс метод, упорядочивающий хранение окружностей в массив. Для инициализации полей радиуса и длины
окружности используйте класс Random или метод random() класса Math по желанию
*/

class Circle {
    Integer radius;
    Point center;

    Integer getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public double circleArea() {
        return Math.PI * radius * radius;
    }

    public double circleLength() {
        return 2 * Math.PI * radius;
    }

    public Circle(Integer radius, Point center) {
        this.radius = radius;
        this.center = center;
    }
}


class Point {
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


