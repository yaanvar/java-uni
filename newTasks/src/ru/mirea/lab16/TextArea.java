package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame implements ActionListener {

    static JFrame f;
    static JButton b, b1, b2, b3, b4, b5;
    static JLabel l, l1;
    static JTextArea jt;

    public static void main(String[] args) {
        f = new JFrame("textfield");

        // create a label to display text
        l = new JLabel("nothing entered");
        l1 = new JLabel("0 lines");

        // create a new buttons
        b = new JButton("Courier New");
        b1 = new JButton("red");
        b2 = new JButton("blue");
        b3 = new JButton("black");
        b4 = new JButton("MS Sans Serif");
        b5 = new JButton("Times New Roman");

        TextArea te = new TextArea();

        b.addActionListener(te);
        b1.addActionListener(te);
        b2.addActionListener(te);
        b3.addActionListener(te);
        b4.addActionListener(te);
        b5.addActionListener(te);

        jt = new JTextArea("write something ", 10, 10);

        JPanel p = new JPanel();

        p.add(jt);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b);
        p.add(b4);
        p.add(b5);
        p.add(l);
        p.add(l1);

        f.add(p);
        f.setSize(300, 300);

        f.show();
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Courier New")) {
            Font f = new Font("Courier", Font.PLAIN, 15);
            jt.setFont(f);
        }
        else if (s.equals("Times New Roman")) {
            Font f = new Font("Courier", Font.PLAIN, 15);
            jt.setFont(f);
        }
        else if (s.equals("MS Sans Serif")) {
            Font f = new Font("Serif", Font.PLAIN, 15);
            jt.setFont(f);
        }
        else if (s.equals("red")) {
            Font f = new Font("Serif", Font.PLAIN, 15);
            jt.setForeground(Color.red);
            jt.setFont(f);
        }
        else if (s.equals("blue")) {
            Font f = new Font("Serif", Font.PLAIN, 15);
            jt.setForeground(Color.blue);
            jt.setFont(f);
        }
        else if (s.equals("black")) {
            Font f = new Font("Serif", Font.PLAIN, 15);
            jt.setForeground(Color.black);
            jt.setFont(f);
        }
    }
}

