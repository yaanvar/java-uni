package ru.mirea.lab22;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("Stack is empty");
    }
}