package ru.mirea.lab19;

import java.util.Scanner;

public class View {
    private Model model;
    private Scanner scanner;

    public View(Model model) {
        this.model = model;
        scanner = new Scanner(System.in);
    }

    public void run() throws StringException, StudentNotFoundException {
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display students");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void addStudent() throws StringException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter mark: ");
        double mark = scanner.nextDouble();
        scanner.nextLine();
        if (name.equals(""))
            throw new StringException();
        model.addStudent(new Student(name, mark));
    }

    private void removeStudent() throws StudentNotFoundException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        model.removeStudent(name);
    }

    private void displayStudents() {
        System.out.println(model);
    }

}