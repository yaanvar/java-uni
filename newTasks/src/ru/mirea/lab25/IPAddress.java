package ru.mirea.lab25;

import java.util.regex.Pattern;

public class IPAddress {

    public static void main( String[] args){
        checkIP("127.0.0.1");
        checkIP("255.255.255.255");
        checkIP("562.1.2.32");
        checkIP("abc.def.gha.bcd");
    }

    public static void checkIP(String inputStr){
        var regex = "^(((1?\\d?\\d)|(2[0-4]\\d)|(25[0-5]))\\.){3}(((1?\\d?\\d)|(2[0-4]\\d)|(25[0-5])))$";
        if (Pattern.matches(regex, inputStr)) {
            System.out.println(inputStr + " is IP");
        } else {
            System.out.println(inputStr + " is not IP");
        }
    }
}