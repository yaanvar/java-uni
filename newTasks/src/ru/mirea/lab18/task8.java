package ru.mirea.lab18;

import java.util.Scanner;

public class task8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        try {
            printDetails( key );
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            getKey();
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        } catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key; }

    public static void main(String[] args) throws Exception {
        task8 t = new task8();
        t.getKey();
    }
}
