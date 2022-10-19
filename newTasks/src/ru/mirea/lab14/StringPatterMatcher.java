package ru.mirea.lab14;

import java.text.ParseException;
import java.util.*;
import java.util.function.Function;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPatterMatcher {

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static <String> Map<String, Long> frequencyMap(Stream<String> elements) {
        return elements.collect(
                Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.counting()
                )
        );
    }

    public static void main(String[] args) throws ParseException {
        Pattern pattern = Pattern.compile("\\d+\\s?");
        String[] words = pattern.split("java5tiger 77 java6mustang");
        for (String word : words)
            System.out.println(word);

        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m1 = p1.matcher( "abcdefghijklmnopqrstuv18340" );
        boolean b = m1.matches();
        System.out.println(b);

        String price = "Item 1-455 RUB Item 2-25 USD";
        List<String> store = new ArrayList<>();
        String [] tmpBox = price.split("Item");
        for (int i = 1; i < tmpBox.length; i++) {
            Pattern p2 = Pattern.compile("USDRUBEU");
            Matcher m2 = p1.matcher( "USDRUBEU" );
            store.add(tmpBox[i].split("-")[1]);
        }
        for(String item: store) {
            System.out.println(item);
        }

        Pattern p = Pattern.compile("-?\\d+(\\.\\d+)?");
        String date = "12/12/2000";
        String[] dates = date.split("/");
        if (dates[0].length() == 2 && dates[1].length() == 2 && dates[2].length() == 4 && p.matcher(dates[0]).matches() && p.matcher(dates[1]).matches() && p.matcher(dates[2]).matches()) {
            Integer day = Integer.parseInt(dates[0]);
            Integer month = Integer.parseInt(dates[1]);
            Integer year = Integer.parseInt(dates[2]);
            System.out.println("it's a date");
        } else {
            System.out.println("it's not a date");
        }

        System.out.println(isValid("vasya@mail.ru"));

        String password;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER PASSWORD");
        password = in.next();
        boolean hasLetter = false;
        boolean hasDigit = false;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {
                    hasLetter = true;
                }
                else if (Character.isDigit(x)) {
                    hasDigit = true;
                }
                if(hasLetter && hasDigit){

                    break;
                }
            }
            if (hasLetter && hasDigit) {
                System.out.println("STRONG");
            } else {
                System.out.println("NOT STRONG");
            }
        } else {
            System.out.println("HAVE AT LEAST 8 CHARACTERS");
        }

        String test = "a\nb\n\nc\n";
        String[] lines = test.split("\\n", -1);


        String[] a = { "s", "", "1", "", "" };
        a = Arrays.stream(a).filter(s -> !s.isEmpty()).toArray(String[]::new);

        List<String> w = Arrays.asList("hello", "hello", "mighty");
        System.out.println(frequencyMap(w.stream()));
    }
}
