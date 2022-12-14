package ru.mirea.lab18;

public class task6 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        return "data for " + key; }

    public static void main(String[] args) {
        task6 t = new task6();
        t.printMessage(null);
        t.printMessage("key set");
    }
}