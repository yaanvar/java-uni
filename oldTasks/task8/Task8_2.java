package ru.mirea.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

    /*
    Создайте окно, отобразите в нем картинку, путь к которой указан в аргументах командной строки.
    */

public class Task8_2 {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        JFrame frame = new JFrame("window");
        frame.setVisible(true);
        String imagePath = "/Users/anvar/Developer/java-uni/task8/Resources/swift.png";
        BufferedImage myPicture = ImageIO.read(new File(imagePath));


        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JPanel jPanel = new JPanel();
        frame.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
        jPanel.add(picLabel);
        frame.add(jPanel);
    }
}
