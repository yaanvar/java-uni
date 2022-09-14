package ru.mirea.task7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task7
{

    // Movable
    interface Movable {
        void moveDown();
        void moveUp();
        void moveLeft();
        void moveRight();
    }

    public class MovablePoint implements Movable {
        Integer x;
        Integer y;
        Integer xSpeed;
        Integer ySpeed;

        public MovablePoint(Integer x, Integer y, Integer xSpeed, Integer ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveDown() {
            this.y -= ySpeed;
        }

        @Override
        public void moveUp() {
            this.y += ySpeed;
        }

        @Override
        public void moveLeft() {
            this.x -= xSpeed;
        }

        @Override
        public void moveRight() {
            this.x += xSpeed;
        }

        @Override
        public String toString() {
            return "MoveblePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }
    }

    public class MovableRectangle implements Movable {
        MovablePoint topLeft;
        MovablePoint bottomRight;

        public MovableRectangle(Integer x1, Integer y1, Integer x2, Integer y2, Integer xSpeed, Integer ySpeed) {
            this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

        @Override
        public String toString() {
            return "MovableRectangle{" +
                    "topLeft=" + topLeft +
                    ", bottomRight=" + bottomRight +
                    '}';
        }

        @Override
        public void moveDown() {
            this.topLeft.y -= topLeft.ySpeed;
            this.topLeft.y -= topLeft.ySpeed;
            this.bottomRight.y -= topLeft.ySpeed;
            this.bottomRight.y -= topLeft.ySpeed;
        }

        @Override
        public void moveUp() {
            this.topLeft.y += topLeft.ySpeed;
            this.topLeft.y += topLeft.ySpeed;
            this.bottomRight.y += topLeft.ySpeed;
            this.bottomRight.y += topLeft.ySpeed;
        }

        @Override
        public void moveLeft() {
            this.topLeft.x -= topLeft.xSpeed;
            this.topLeft.x -= topLeft.xSpeed;
            this.bottomRight.x -= topLeft.xSpeed;
            this.bottomRight.x -= topLeft.xSpeed;
        }

        @Override
        public void moveRight() {
            this.topLeft.x += topLeft.xSpeed;
            this.topLeft.x += topLeft.xSpeed;
            this.bottomRight.x += topLeft.xSpeed;
            this.bottomRight.x += topLeft.xSpeed;
        }
    }

    // Shape

    public class Shape {
        String color;
        Boolean filled;

        public Shape() {
            this.color = "transparent";
            this.filled = false;
        }

        public Shape(String color, Boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public Boolean isFilled() {
            return filled;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setFilled(Boolean filled) {
            this.filled = filled;
        }

        double getArea() {
            return 0.0;
        }

        double getPerimeter() {
            return  0.0;
        }

        @Override
        public String toString() {
            return "Shape{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }
    }

    public  class Circle extends Shape {
        double radius;

        public Circle() {
            this.radius = 0.0;
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(String color, Boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double getPerimeter() {
            return Math.PI * 2 * radius;
        }
    }

    public class Rectangle extends Shape {
        double length;
        double width;

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public Rectangle(String color, Boolean filled, double length, double width) {
            super(color, filled);
            this.length = length;
            this.width = width;
        }

        public Rectangle() {
            this.width = 0.0;
            this.length = 0.0;
        }

        @Override
        double getArea() {
            return width * length;
        }

        @Override
        double getPerimeter() {
            return 2 * width + 2 * length;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "length=" + length +
                    ", width=" + width +
                    ", color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }
    }

    class Square extends Rectangle {
        double side;

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public Square(String color, Boolean filled, double side) {
            super(color, filled, side, side);
            this.side = side;
        }

        public Square(double side) {
            this.side = side;
        }

        public Square() {
            this.side = 0.0;
        }

        @Override
        public void setLength(double length) {
            super.setLength(length);
            super.setWidth(length);
            this.side = length;
        }

        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            super.setLength(width);
            this.side = width;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args){

    }
}