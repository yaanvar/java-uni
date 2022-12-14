package ru.mirea.lab18;

public class task1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        task1 t = new task1();
        t.exceptionDemo();
    }
}