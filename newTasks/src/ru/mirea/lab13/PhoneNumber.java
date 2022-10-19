package ru.mirea.lab13;

import java.text.ParseException;

public class PhoneNumber {
    String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    static void showChangedNumber(String number) {
        String digits = number.substring(number.length() - 11, number.length());
        String newNumber = "";
        if(number.startsWith("8")) {
            newNumber = "+7" + digits.substring(1, 4) + "-" + digits.substring(4, 7) + "-" + digits.substring(7, 9) + "-" + digits.substring(9, 11);
        } else {
            newNumber = number.substring(0, number.length() - 10) + digits.substring(1, 4) + "-" + digits.substring(4, 7) + "-" + digits.substring(7, 9) + "-" + digits.substring(9, 11);
        }
        System.out.println(newNumber);
    }

    public static void main(String[] args) throws ParseException {
        showChangedNumber("+1019999798141");
    }
}
