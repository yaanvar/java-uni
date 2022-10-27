package ru.mirea.lab16;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Guess extends JFrame implements ActionListener{

    private JPanel panel = new JPanel(new BorderLayout());
    private JPanel panelButtons = new JPanel(new FlowLayout());
    private JPanel panelBottom = new JPanel(new BorderLayout());
    private JTextField fieldBox = new JTextField(10);
    private JButton button1 = new JButton("Try");
    private JButton button2 = new JButton("Quit");
    private JLabel comment = new JLabel("guess ..");
    private int randomNumber;

    public Guess() {
        super("Guess Number");
        randomNumber = new Random().nextInt(20) + 1;
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(buildWindow());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    private JComponent buildWindow() {
        panelButtons.add(button1);
        panelButtons.add(button2);
        panelBottom.add(panelButtons, BorderLayout.NORTH);
        panelBottom.add(comment, BorderLayout.SOUTH);
        panel.add(new JLabel("Guess a number from 1 to 20"), BorderLayout.NORTH);
        panel.add(fieldBox, BorderLayout.CENTER);
        panel.add(panelBottom, BorderLayout.SOUTH);
        return panel;
    }
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(button1)){
            comment.setText(" ");
            compareResult();
        } else if (obj.equals(button2)){
            System.exit(0);
        }
    }
    private void compareResult(){
        int userInput=0;
        int diff;
        int Difference;
        try {
            userInput = Integer.parseInt(
                    fieldBox.getText().trim());
        } catch (Exception ex){
            comment.setText("Enter a VALID number!");
            return;
        }
        if (userInput == randomNumber){
            JOptionPane.showMessageDialog(null, "CONGRATULATIONS!",
                    "Random Number: " + randomNumber, JOptionPane.INFORMATION_MESSAGE);
            randomNumber = new Random().nextInt(1000) + 1;
            return;
        }
        if (userInput > randomNumber){
            comment.setText( "Too High. Try a lower number." );
            diff=userInput - randomNumber;
            Difference=Math.abs(diff);
        } else {
            comment.setText( "Too Low. Try a higher number." );
            diff=randomNumber - userInput;
            Difference=Math.abs(diff);
        }
    }
    private void setBackgroundColor(Color color){
        panel.setBackground(color);
        panelBottom.setBackground(color);
        panelButtons.setBackground(color);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Guess guess = new Guess();
                guess.setVisible(true);
            }
        });
    }
}