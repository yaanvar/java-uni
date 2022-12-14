package ru.mirea.lab19;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        try {
            view.run();
        } catch (StringException e) {
            System.out.println(e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}