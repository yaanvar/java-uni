package ru.mirea.lab27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertStructure {

    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("4");
        hashSet.add("3");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}