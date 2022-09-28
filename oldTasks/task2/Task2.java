package ru.mirea.task2;
import org.testng.annotations.Test;

import java.util.*;

public class Task2
{
    /*
    Реализуйте простейший класс Shape (Фигура) на языке программирования Java.
    Добавьте метод toString(). Создайте класс-тестер для вывода информации об объекте.
    */

    public class Shape {
        String name;
        Integer dimensions;

        public Shape(String name, int dimensions) {
            this.name = name;
            this.dimensions = dimensions;
        }

        @Override
        public String toString() {
            return "Shape{"
                    + "name='" + name + '\''
                    + ", dimensions=" + dimensions
                    + '}';
        }
    }

    public class Tester {
        @Test
        void testShape() {
            Shape triangle = new Shape("triangle", 2);
            assert(triangle != null);
            triangle.toString();
        }
    }

    /*
    Реализуйте простейший класс Ball (Мяч).
     */

    public class Ball {
        String purpose = "football";

        public Ball(String purpose) {
            this.purpose = purpose;
        }
    }

    /*
    Реализуйте простейший класс Book (Книга).
     */

    public class Book {
        String author;
        String genre;
        Integer pages;
        Integer yearItWasPublished;

        public Book(String author, String genre, int pages, int yearItWasPublished) {
            this.author = author;
            this.genre = genre;
            this.pages = pages;
            this.yearItWasPublished = yearItWasPublished;
        }
    }

    /*
    Разработайте и реализуйте класс Dog (Собака): поля класса описывают кличку
    и возраст собаки. Необходимо выполнить следующие действия: определить конструктор
    собаки, чтобы принять и инициализировать данные экземпляра, включить стандартные
    методы (аксессоры) для получения и установки для имени и возраста, включить метод
    для перевода возраста собаки в «человеческий» возраст (возраст человека равен возрасту
    собаки, умноженному на 7), включить метод ToString, который возвращает описание экземпляра
    собаки в виде строки.
    */

    public class  Dog {
        String name;
        Integer age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public void setName(String newName){
            name = newName;
        }

        public void setAge(int newAge){
            age = newAge;
        }

        public int ageInHumanYears(int dogAge) {
            return dogAge * 7;
        }

        @Override
        public String toString() {
            return "Dog{"
                    + "name='" + name + '\''
                    + ", age=" + age
                    + '}';
        }
    }

    /*
    Создайте класс-тестер под названием TestDog - он реализует
    массив собак, основной метод этого класса позволяет добавить несколько объектов Dog.
    */

    class TestDog {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        public void addNewDogs(int amount) {
            for (int i = 0; i < amount; i++) {
                String name = "doggy number " + Integer.toString(i);
                Dog tempDog = new Dog("doggy", i);
            }
        }
    }

    public static void main(String[] args){
    }
}
