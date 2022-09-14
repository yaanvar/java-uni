package ru.mirea.task6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task6
{
    /*
    1. Создайте интерфейс Nameable с методом getName(), возвращающим имя объекта, реализующего интерфейс.
       Проверьте его работу для различных объектов (например, можно создать классы, описывающие разные сущности,
       которые могут иметь имя: планеты, машины, животные и т. д.).
    */

    interface Nameable {
        String getName();
    }

    class Person implements Nameable {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    class Planet implements Nameable {
        String name;

        public Planet(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    public class TestInterfaces {
        public void main(String[] args){
            Person person = new Person("Ivan Gridasov");
            Planet planet = new Planet("Mars");
            System.out.println(person.getName());
            System.out.println(planet.getName());
        }
    }

    /*
    2. Реализуйте интерфейс Priceable, имеющий метод getPrice(), возвращающий некоторую цену для объекта.
       Проверьте его работу для различных классов, сущности которых могут иметь цену.
     */

    interface Priceable {
        Integer getPrice();
    }

    class Food implements Priceable {
        String name;
        Integer price;

        public Food(String name, int price) {
            this.name = name;
            this.price = price;
        }


        @Override
        public Integer getPrice() {
            return price;
        }
    }

    class Car implements Priceable {
        String name;
        Integer price;

        public Car(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public Integer getPrice() {
            return price;
        }
    }

    public class TestInterfaces2 {
        public void main(String[] args){
            Food food = new Food("paste", 400);
            Car car = new Car("Tesla Model S", 5000000);
            System.out.println(food.getPrice());
            System.out.println(car.getPrice());
        }
    }

    public static void main(String[] args){

    }
}