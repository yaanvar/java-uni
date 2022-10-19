package ru.mirea.lab13;

import java.text.ParseException;
import java.util.ArrayList;

public class Shirt {

    String article;
    String name;
    String color;
    String size;

    public Shirt(String article, String name, String color, String size) {
        this.article = article;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    static void showShirts(String shirts) {
        String[] shirt = shirts.split("[;]+");
        ArrayList<Shirt> shirtArrayList = new ArrayList<>();
        for(int i = 0; i < 11; i++) {
            String[] about = shirt[i].split("[=,]+");
            Shirt newShirt = new Shirt(about[1], about[2], about[3], about[4]);
            shirtArrayList.add(newShirt);
        }
        for(int i = 0; i < shirtArrayList.size(); i++) {
            System.out.println(shirtArrayList.get(i).article + " " + shirtArrayList.get(i).name + " " + shirtArrayList.get(i).size + " " + shirtArrayList.get(i).color + " ");
        }
    }

    public static void main(String[] args) throws ParseException {
        String str = "shirts[0] = S001,Black Polo Shirt,Black,XL; shirts[1] = S002,Black Polo Shirt,Black,L; shirts[2] = S003,Blue Polo Shirt,Blue,XL; shirts[3] = S004,Blue Polo Shirt,Blue,M; shirts[4] = S005,Tan Polo Shirt,Tan,XL; shirts[5] = S006,Black T-Shirt,Black,XL; shirts[6] = S007,White T-Shirt,White,XL; shirts[7] = S008,White T-Shirt,White,L; shirts[8] = S009,Green T-Shirt,Green,S; shirts[9] = S010,Orange T-Shirt,Orange,S; shirts[10] = S011,Maroon Polo Shirt,Maroon,S";

        showShirts(str);

    }
}
