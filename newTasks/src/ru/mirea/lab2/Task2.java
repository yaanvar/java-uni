package ru.mirea.lab2;

public class Task2 {
    public static void main(String[] args){
        TestAuthor testAuthor = new TestAuthor();
        TestBall testBall = new TestBall();
        testAuthor.test();
        testBall.test();

        TestCircle testPointAndCircle = new TestCircle();
        testPointAndCircle.test();
    }
}

