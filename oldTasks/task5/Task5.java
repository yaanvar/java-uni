package ru.mirea.task5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task5
{
    /*
    1. Создайте абстрактный класс, описывающий посуду (Dish).
       С помощью наследования реализуйте различные виды посуды, имеющие свои свойства и методы.
       Протестируйте работу классов.
     */

    public class Dish {
        String size;
        String food = "there is no food";

        public Dish(String size, String food) {
            this.size = size;
            this.food = food;
        }
    }

    public class Plate extends Dish {
        String size;
        String food = "there is no food";

        public Plate(String size, String food) {
            super(size, food);
        }

        void plateContains() {
            System.out.println(food + "on the " + size + " plate.");
        }
    }

    public class Cup extends Dish {
        String size;
        String liquid = "there is no liquid";

        public Cup(String size, String food) {
            super(size, food);
        }

        void cupContains() {
            System.out.println(liquid + "in the " + size + " cup.");
        }
    }

    public class TestPlateAndCup {
        public void main(String[] args){
            Cup cup = new Cup("big", "coffee");
            cup.cupContains();
            Plate plate = new Plate("small", "pasta");
            plate.plateContains();
        }
    }

    /*
    2. Создайте абстрактный класс, описывающий собак (Dog).
       С помощью наследования реализуйте различные породы собак.
       Протестируйте работу классов.
    */

    public class Dog {
        String breed;
        public Dog(String breed) {
            this.breed = breed;
        }
    }

    public class ShibaInu extends Dog {

        String name;
        public ShibaInu(String name) {
            super("ShibaInu");
            this.name = name;
        }

        public void bark() {
            System.out.println("omae wa yowai");
        }
    }

    public class Pug extends Dog {
        String name;

        public Pug(String name) {
            super("Pug");
            this.name = name;
        }

        public void bark() {
            System.out.println("puk-puk");
        }
    }

    public class TestShibaInuAndPug {
        public void main(String[] args){
            ShibaInu shibaInu = new ShibaInu("Yoshi");
            shibaInu.bark();
            Pug pug = new Pug("Moisha");
            pug.bark();
        }
    }

    /*
    3. Создайте абстрактный класс, описывающий мебель (Furniture).
       С помощью наследования реализуйте различные виды мебели. Также создайте класс FurnitureShop, моделирующий магазин мебели.
       Протестируйте работу классов.
     */
    public class Furniture {
        String manufacturer;

        public Furniture(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public class Desk extends Furniture {
        String type;

        public Desk(String manufacturer) {
            super(manufacturer);
            this.type = "desk";
        }
    }

    public class Chair extends Furniture {
        String type;

        public Chair(String manufacturer) {
            super(manufacturer);
            this.type = "chair";
        }
    }

    public class FurnitureShop {
        ArrayList<Furniture> inStock;

        public FurnitureShop(ArrayList<Furniture> stock) {
            this.inStock = stock;
        }

        public void buy(Furniture furniture) {
            inStock.remove(furniture);
        }


        @Override
        public String toString() {
            return "FurnitureShop{" +
                    "inStock=" + inStock +
                    '}';
        }
    }

    public class TestFurnitureAndFurnitureShop {
        public void main(String[] args){
            Chair chair = new Chair("ikea");
            Desk desk = new Desk("hoff");
            ArrayList<Furniture> stock = new ArrayList<Furniture>();
            stock.add(chair);
            stock.add(desk);
            FurnitureShop furnitureShop = new FurnitureShop(stock);
            System.out.println(furnitureShop.toString());
            furnitureShop.buy(chair);
            System.out.println(furnitureShop.toString());
        }
    }

    public static void main(String[] args){

    }
}