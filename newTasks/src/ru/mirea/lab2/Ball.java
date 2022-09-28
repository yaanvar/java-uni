package ru.mirea.lab2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/*
По UML диаграмме класса, представленной на рис. 2.5 написать программу, которая состоит из двух классов.
Один из них Ball должен реализовывать сущность мяч, а другой с названием TestBall тестировать работу созданного класса.
Класс Ball должен содержать реализацию методов, представленных на UML.
Диаграмма на рисунке описывает сущность Мяч написать программу. Класс Ball моделирует движущийся мяч.
*/
public class  Ball {

    Double x = 0.0;
    Double y = 0.0;

    public Ball(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "x='" + x + '\''
                + ", y=" + y
                + '}';
    }

}

class TestBall {
    public void test() {
        Ball ball = new Ball(12.0, -5.8);
        System.out.println(ball);
        Scanner scan = new Scanner(System.in);
        Double y = scan.nextDouble();
        ball.setY(y);
        System.out.println(ball.getY());
        Double x = scan.nextDouble();
        y = scan.nextDouble();
        ball.setXY(x, y);
        System.out.println("x: " + ball.getX() + ", y: " + ball.getY());
        Double xDisp = scan.nextDouble();
        Double yDisp = scan.nextDouble();
        ball.move(xDisp, yDisp);
        System.out.println("x: " + ball.getX() + ", y: " + ball.getY());
    }
}

