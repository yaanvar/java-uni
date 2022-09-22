package ru.mirea.task9;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;

public class Task9 {

    /*
    - одна кнопка JButton с подписью первой команды;
    - другая JButton с подписью второй команды;
    - надпись JLabel содержит текст “Result: 0 X 0”;
    - надпись JLabel содержит текст “Last Scorer: N/A”;
    - надпись Label содержит текст “Winner: DRAW”.
     */

    void addFirstScore {
        Result()
    }

    public static void main(String[] args){
        JFrame jframe = new JFrame("window");
        jframe.setSize(500, 500);
        jframe.setVisible(true);
        Integer firstScore, secondScore = 0;
        JButton firstButton = new JButton("first team");
        JButton secondButton = new JButton("second team");

        JLabel label = new JLabel();
        label.setText("Result 0 X 0");
        label.setBounds(50, 50, 250, 50);

        JLabel lastScorerLabel = new JLabel();
        lastScorerLabel.setText("Last Scorer: N/A");
        lastScorerLabel.setBounds(50, 100, 250, 50);

        JLabel winnerLabel = new JLabel();
        winnerLabel.setText("Winner: N/A");
        winnerLabel.setBounds(50, 150, 250, 50);

        firstButton.setBounds(150, 300, 150, 150);
        firstButton.addActionListener(this);
        secondButton.setBounds(350, 300, 150, 150);
        secondButton.addActionListener(this);

        jframe.add(firstButton);
        jframe.add(secondButton);
        jframe.add(label);
        jframe.add(lastScorerLabel);
        jframe.add(winnerLabel);
    }
}
