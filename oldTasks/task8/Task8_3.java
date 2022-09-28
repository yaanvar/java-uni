package ru.mirea.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

    /*
    Создайте окно, реализуйте анимацию с помощью картинки, состоящей из нескольких кадров.
     */

public class Task8_3 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        JFrame frame = new JFrame("window");
        frame.setVisible(true);
        frame.setSize(new Dimension(100, 100));
        String imagePath = "/Users/anvar/Developer/java-uni/task8/Resources/gumby.gif";
        String imagePath2 = "/Users/anvar/Developer/java-uni/task8/Resources/gumby2.gif";
        BufferedImage myPicture = ImageIO.read(new File(imagePath));
        BufferedImage myPicture2 = ImageIO.read(new File(imagePath2));

        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
        JPanel jPanel = new JPanel();

        frame.add(jPanel);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (random.nextBoolean()) {
                    jPanel.add(picLabel2);
                } else{
                    jPanel.add(picLabel);
                }
                frame.invalidate();
                frame.validate();
                frame.repaint();
            }
        }, 0, 250);

    }
}
