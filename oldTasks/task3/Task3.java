package ru.mirea.task3;

import java.util.Scanner;

public class Task3
{

    /*
    Создайте класс, описывающий модель окружности (Circle).
    В классе должны быть описаны нужные свойства окружности и методы для получения,
    изменения этих свойств. Протестируйте работу класса в CircleTest, содержащем
    статический метод main(String[] args).
    */

    public static class Circle {
        Integer radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        Integer getRadius() {
            return radius;
        }

        void setRadius(int radius) {
            this.radius = radius;
        }
    }

    public class TestCircle {
        public static void main(String[] args){
            Circle smallCircle = new Circle(5);
            System.out.println(smallCircle.getRadius());
            Scanner scan = new Scanner(System.in);
            int newRadius = scan.nextInt();
            smallCircle.setRadius(newRadius);
            System.out.println(smallCircle.getRadius());
        }
    }


    /*
    Создайте класс, описывающий тело человека (Human). Для описания каждой
    части тела создайте отдельные классы (Head, Leg, Hand). Опишите необходимые
    свойства и методы для каждого класса. Протестируйте работу класса Human.
    */

    public static class Human {
        String name;
        Integer age;

        String eyeColor;
        String hairColor;



        Leg rightLeg = new Leg(true);
        Leg leftLeg = new Leg(false);

        Hand righHand = new Hand(true);
        Hand leftHand = new Hand(false);

        Head head = new Head(eyeColor, hairColor);

        public Human(String name, int age, String hairColor, String eyeColor) {
            this.name = name;
            this.age = age;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
        }

        public class Leg {
            Boolean isRight;

            public Leg(Boolean isRight) {
                this.isRight = isRight;
            }
        }

        public class Hand {
            Boolean isRight;

            public Hand(Boolean isRight) {
                this.isRight = isRight;
            }
        }

        public class Head {
            String eyeColor;
            String hairColor;

            public Head(String eyeColor, String hairColor) {
                this.eyeColor = eyeColor;
                this.hairColor = hairColor;
            }
        }
    }

    public class TestHuman {
        public static void main(String[] args){
            Human human = new Human("Vasya", 15, "blond", "blue");
            System.out.println(human);
        }
    }

    /*
    Создайте класс, описывающий книгу (Book). В классе должны быть описаны
    нужные свойства книги (автор, название, год написания и т. д.) и методы
    для получения, изменения этих свойств. Протестируйте работу класса в BookTest,
    содержащем статический метод main(String[] args).
    */

    public static class Book {
        String author;
        String title;
        Integer yearOfPublishing;

        public Book(String author, String title, Integer yearOfPublishing) {
            this.author = author;
            this.title = title;
            this.yearOfPublishing = yearOfPublishing;
        }

        String getAuthor() {
            return author;
        }

        void setAuthor(String author) {
            this.author = author;
        }

        String getTitle() {
            return title;
        }

        void setTitle(String title) {
            this.title = title;
        }

        Integer getYearOfPublishing() {
            return yearOfPublishing;
        }

        void setYearOfPublishing(int yearOfPublishing) {
            this.yearOfPublishing = yearOfPublishing;
        }
    }

    public class TestBook {
        public static void main(String[] args){
            Book book = new Book("Franz Kafka", "Amerika", 1905);
            System.out.println(book.getAuthor());
            Scanner scan = new Scanner(System.in);
            Integer newYearOfPublishing = scan.nextInt();
            book.setYearOfPublishing(newYearOfPublishing);
            System.out.println(book.getYearOfPublishing());
        }
    }

    public static void main(String[] args){

    }
}