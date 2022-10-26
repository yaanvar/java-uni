package ru.mirea.lab15;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox extends JFrame {

    public ComboBox() {

        super("Test");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Verdana", Font.PLAIN, 18);

        String[] items = {
                "Russia",
                "Ukraine",
                "Usa"
        };

        Container content = getContentPane();

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        final JLabel label = new JLabel(" ");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                label.setText(item);
            }
        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(font);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.addActionListener(actionListener);
        content.add(comboBox);

        JComboBox editComboBox = new JComboBox(items);
        editComboBox.setEditable(true);
        editComboBox.setAlignmentX(LEFT_ALIGNMENT);
        editComboBox.setFont(font);
        editComboBox.addActionListener(actionListener);
        content.add(editComboBox);

        setPreferredSize(new Dimension(240, 130));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new ComboBox();
            }
        });
    }
}
