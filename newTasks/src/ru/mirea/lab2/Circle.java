package ru.mirea.lab2;

import java.util.Scanner;

/*
Создать класс, описывающий модель окружности (Circle).
В классе должны быть описаны нужные свойства окружности и методы для получения и
изменения этих свойств. Добавить методы для расчета площади круга и длины окружности.
При помощи класса CircleTest, содержащего
статический метод main(String[] args), протестировать работу класcа Circle.
 */
public class Circle {
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

class TestCircle {
    public static void test() {
        Point centerPoint = new Point(12.4, -3.4);
        Circle smallCircle = new Circle(5, centerPoint);
        System.out.println(smallCircle.getRadius());
        Scanner scan = new Scanner(System.in);
        int newRadius = scan.nextInt();
        smallCircle.setRadius(newRadius);
        System.out.println(smallCircle.getRadius());
        System.out.println(smallCircle.circleArea());
        System.out.println(smallCircle.circleLength());
    }
}
