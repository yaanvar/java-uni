package ru.mirea.lab26;

import java.util.TreeSet;

public class Tester {
    public static void main(String[] args){
        HashTable tab = new HashTable();
        tab.hashtabInit();
        tab.hashtabAdd(10,"a");
        tab.hashtabAdd(15,"b");
        tab.hashtabAdd(8,"c");
        tab.hashtabAdd(3,"d");

        System.out.println(tab.hashtabLookUp(3));
        tab.hashtabDelete(3);
        System.out.println(tab.hashtabLookUp(3));
        System.out.println(tab.hashtabLookUp(10));
    }
}