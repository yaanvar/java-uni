package ru.mirea.lab22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    private JPanel panelMainFrame;
    private JButton[] buttons = new JButton[16];
    private JTextField textUserInputField;

    private int btnWidth;

    private int btnHeight;

    public CalculatorView(JPanel panelMainFrame){
        this.panelMainFrame = panelMainFrame;

        panelMainFrame.setSize(360,200);
        panelMainFrame.setMaximumSize(new Dimension(360,200));

        btnHeight = 40;
        btnWidth = 90;

        String[] btnValues = { "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                ".", "0", "=", "+" };

        JPanel panelMain = new JPanel();
        panelMain.setLayout(null);

        for (int i = 0; i < btnValues.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText(btnValues[i]);
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setMargin(new Insets(0, 0, 0, 0));
            buttons[i].setBounds((i % 4) * btnWidth, btnHeight + (i / 4) * btnHeight, btnWidth, btnHeight);
            panelMain.add(buttons[i]);
        }

        textUserInputField = new JTextField(32);
        textUserInputField.setBounds(0, 0, btnWidth * 4, btnHeight);
        textUserInputField.setBackground(Color.white);
        panelMain.add(textUserInputField);

        panelMain.setBackground(Color.gray);
        panelMainFrame.add(panelMain);
    }

    public void setActionListener(ActionListener actionListener){
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(actionListener);
        }
    }

    public String getUserInput(){
        return textUserInputField.getText();
    }

    public void setTextUserInputField(String text){
        textUserInputField.setText(text);
    }

    public void showAlertDialog(String message){
        JOptionPane.showMessageDialog(panelMainFrame, message);
    }
}