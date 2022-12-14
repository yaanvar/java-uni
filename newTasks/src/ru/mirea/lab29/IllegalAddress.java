package ru.mirea.lab29;

public class IllegalAddress extends Error{
    public IllegalAddress(String address){
        super("There is no such address " + address);
    }
}