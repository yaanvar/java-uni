package ru.mirea.task8;

import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task8
{

    /*
    Создайте окно, нарисуйте в нем 20 случайных фигур случайного цвета.
    Классы фигур должны наследоваться от абстрактного класса Shape, в котором описаны свойства фигуры: цвет, позиция.
    *

     */

    Random random = new Random();

    public static class Shape {
        Color color;
        Double x, y;
    }

    public static class Circle extends Shape {

        public Circle(Color color, Double x, Double y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public void draw(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);

            g2d.setColor(color);
            g2d.fill(circle);
        }
    }

    public static class Rectangle extends Shape {
        public Rectangle(Color color, Double x, Double y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }


        public void draw(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            Rectangle2D.Double circle = new Rectangle2D.Double(x, y, 10, 10);

            g2d.setColor(color);
            g2d.fill(circle);
        }
    }



    public static void main(String[] args) throws IOException {
        Random random = new Random();
        JFrame frame = new JFrame("window");
        frame.setVisible(true);
        JButton button = new JButton();
        frame.setBounds(0, 0,1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel contentPane = new JPanel(){
            Graphics2D g2;

            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g2 = (Graphics2D)g;
                g2.setColor(Color.BLACK);
                for(int i = 0; i < 20; i++) {
                    if (random.nextBoolean()) {
                        Rectangle rect = new Rectangle(Color.BLUE, (double) (15 * i), (double) (15 * i));
                        rect.draw(g);
                    } else {
                        Circle circ = new Circle(Color.red, (double) (15 * i), (double) (15 * i));
                        circ.draw(g);
                    }
                }
            }
        };
        frame.setContentPane(contentPane);
    }
}