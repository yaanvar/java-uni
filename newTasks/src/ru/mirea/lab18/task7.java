package ru.mirea.lab18;

import java.util.Scanner;

public class task7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        task7 t = new task7();
        t.getKey();
    }
}