package ru.mirea.task4;
import ru.mirea.task3.Task3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task4
{
    // Author
    public class  Author {
        String name;
        String email;
        Character gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        String getName() { return name; }

        String getEmail() { return email; }

        Character getGender() { return gender; }

        void setEmail(String email) { this.email = email; }

        @Override
        public String toString() {
            return "Author{"
                    + "name='" + name + '\''
                    + ", email=" + email + '\''
                    + ", gender=" + gender
                    + '}';
        }

    }

    public class TestAuthor {
        public void main(String[] args){
            Author author = new Author("Franz", "franz_kafka@gmail.com", 'M');
            System.out.println(author.getName());
            Scanner scan = new Scanner(System.in);
            String newEmail = scan.nextLine();
            author.setEmail(newEmail);
            System.out.println(author.getEmail());
        }
    }

    // Ball

    public class  Ball {

        Double x = 0.0;
        Double y = 0.0;

        public Ball(Double x, Double y) {
            this.x = x;
            this.y = y;
        }

        public Ball() {
            this.x = 0.0;
            this.y = 0.0;
        }

        public void setX(double x) {
            this.x = x;
        }
        public void setY(double y) {
            this.y = y;
        }

        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }

        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void move(double xDisp, double yDisp) {
            this.x += xDisp;
            this.y += yDisp;
        }

        @Override
        public String toString() {
            return "Author{"
                    + "x='" + x + '\''
                    + ", y=" + y
                    + '}';
        }

    }

    public class TestBall {
        public void main(String[] args){
            Ball ball = new Ball(12.0, -5.8);
            System.out.println(ball);
            Scanner scan = new Scanner(System.in);
            Double y = scan.nextDouble();
            ball.setY(y);
            System.out.println(ball.getY());
            Double x = scan.nextDouble();
            y = scan.nextDouble();
            ball.setXY(x, y);
            System.out.println("x: " + ball.getX() +", y: " +  ball.getY());
            Double xDisp = scan.nextDouble();
            Double yDisp = scan.nextDouble();
            ball.move(xDisp, yDisp);
            System.out.println("x: " + ball.getX() +", y: " +  ball.getY());
        }
    }

    public static void main(String[] args){

    }
}