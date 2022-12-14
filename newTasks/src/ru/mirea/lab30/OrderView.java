package ru.mirea.lab30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OrderView extends JFrame {

    TableOrdersManager tableOrderManager = new TableOrdersManager(4);
    InternetOrdersManager internetTableManager = new InternetOrdersManager();

    Order currentInternetOrder = new InternetOrder();
    Order currentTableOrder = new TableOrder();

    int SelectedTable = -1;


    OrderView() {
        super("orderView");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(new Dimension(640, 480));
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.5;
        constraints.gridy = 0;

        JPanel makeOrderPanel = new JPanel(new GridLayout(2, 2));

        JButton btnCreateOrder = new JButton("Add order");
        makeOrderPanel.add(btnCreateOrder);

        JComboBox tables = new JComboBox(Arrays.toString(tableOrderManager.freeTableNumbers()).split("[\\[\\]]")[1].split(", "));
        tables.setVisible(false);
        tables.setBackground(Color.white);
        makeOrderPanel.add(tables);

        JRadioButton btnInternetOrder = new JRadioButton("Internet order");
        btnInternetOrder.setSelected(true);

        JRadioButton btnTableOrder = new JRadioButton("Table order");
        btnTableOrder.setSelected(false);

        ButtonGroup chooseType = new ButtonGroup();
        chooseType.add(btnTableOrder);
        chooseType.add(btnInternetOrder);

        makeOrderPanel.add(btnInternetOrder);
        makeOrderPanel.add(btnTableOrder);

        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        add(makeOrderPanel, constraints);

        Map<String, Dish> dishesForOrder = new HashMap<>();
        dishesForOrder.put("Spageti", new Dish("Spaggeti", "Spaggeti", 300));
        dishesForOrder.put("Pizza", new Dish("Pizza", "Pizza", 200));

        Map<String, Drink> drinksForOrder = new HashMap<>();
        drinksForOrder.put("Vodka", new Drink("Vodka", "Drink", 500, DrinkTypeEnum.VODKA, 40));
        drinksForOrder.put("Water", new Drink("Water", "Drink", 400, DrinkTypeEnum.WATER, 0));

        constraints.gridwidth = 1;
        JComboBox dishesOrderComboBox = new JComboBox(dishesForOrder.keySet().toArray());
        dishesOrderComboBox.setMaximumSize(new Dimension(200, 200));
        dishesOrderComboBox.setBackground(Color.white);
        constraints.gridy = 1;
        constraints.gridx = 0;
        add(dishesOrderComboBox, constraints);

        JComboBox drinksOrderComboBox = new JComboBox(drinksForOrder.keySet().toArray());
        drinksOrderComboBox.setMaximumSize(new Dimension(200, 200));
        drinksOrderComboBox.setBackground(Color.white);
        constraints.gridy = 1;
        constraints.gridx = 1;
        add(drinksOrderComboBox, constraints);

        JTextArea currentOrderText = new JTextArea("Order: ");
        currentOrderText.setEditable(false);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weighty = 10;
        add(currentOrderText, constraints);

        JTextArea allOrdersText = new JTextArea("Orders: ");
        allOrdersText.setEditable(false);
        allOrdersText.setBackground(Color.LIGHT_GRAY);
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridheight = 3;
        add(allOrdersText, constraints);

        tables.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = (String) ((JComboBox) e.getSource()).getSelectedItem();
                SelectedTable = Integer.parseInt(option);
            }
        });
        btnTableOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tables.setVisible(true);
                currentInternetOrder = new InternetOrder();
                currentOrderText.setText("Order: ");
            }
        });

        btnInternetOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tables.setVisible(false);
                currentTableOrder = new TableOrder();
                currentOrderText.setText("Order: ");
            }
        });

        dishesOrderComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = ((JComboBox) e.getSource()).getSelectedItem().toString();
                if (btnTableOrder.isSelected()) currentTableOrder.add(dishesForOrder.get(option));
                else currentInternetOrder.add(dishesForOrder.get(option));

                currentOrderText.append("\n" + dishesForOrder.get(option) + "\n");
            }
        });

        drinksOrderComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = ((JComboBox) e.getSource()).getSelectedItem().toString();
                if (btnTableOrder.isSelected()) currentTableOrder.add(drinksForOrder.get(option));
                else currentInternetOrder.add(drinksForOrder.get(option));

                currentOrderText.append("\n" + drinksForOrder.get(option) + "\n");
            }
        });


        btnCreateOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                currentOrderText.setText("Order: ");
                if (currentTableOrder.getItems().size() == 0 && currentInternetOrder.getItems().size() == 0) return;
                if (btnTableOrder.isSelected()) {
                    if (SelectedTable == -1) return;
                    tableOrderManager.add(currentTableOrder, SelectedTable);

                    StringBuilder currentOrder = new StringBuilder("\nOrder: ");
                    for (MenuItem item : currentTableOrder.getItems()) {
                        currentOrder.append(item).append("\n");
                    }
                    currentOrder.append("( ").append(SelectedTable).append(" )").append("\n");
                    allOrdersText.append(currentOrder.toString());
                    currentTableOrder = new TableOrder();
                    SelectedTable = -1;
                } else {
                    internetTableManager.add(currentInternetOrder, new Customer("Stas", "Sidorov", 22, new Address("Moscow", 600009, "Mira", 24, 36)));
                    StringBuilder currentOrder = new StringBuilder("\nOrder: \n");
                    for (MenuItem item : currentInternetOrder.getItems()) {
                        currentOrder.append(item).append("\n");
                    }
                    currentOrder.append("\n");
                    allOrdersText.append(currentOrder.toString());
                    currentInternetOrder = new InternetOrder();
                }
            }
        });
    }

    public static void main(String[] args) {
        new OrderView().setVisible(true);
    }
}