package ru.mirea.lab16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PasswordScreen extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user_label, password_label, message, service_label;
    JTextField userName_text, service_text;
    JPasswordField password_text;
    JButton submit, cancel;
    PasswordScreen() {
        service_label = new JLabel();
        service_label.setText("Service:");
        service_text = new JTextField();
        user_label = new JLabel();
        user_label.setText("User Name:");
        userName_text = new JTextField();
        password_label = new JLabel();
        password_label.setText("Password:");
        password_text = new JPasswordField();
        submit = new JButton("SUBMIT");
        panel = new JPanel(new GridLayout(4, 1));
        panel.add(service_label);
        panel.add(service_text);
        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);
        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Login");
        setSize(450,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new PasswordScreen();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            message.setText("Weolcome back " + userName + "");
        } else {
            message.setText("Invalid user..");
        }
    }
}