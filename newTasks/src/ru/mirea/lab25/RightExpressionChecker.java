package ru.mirea.lab25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RightExpressionChecker {
    public static void main(String[] args) {
        ExpressionChecker("2 + 2 = 4");
        ExpressionChecker("(5 + 3 * (92 - 10)) = 10000");
        ExpressionChecker("(5 + 3 * (92 - 10) = 10000");
    }

    public static void ExpressionChecker(String inputExpression){
        Pattern pattern = Pattern.compile("\\([^()]*\\)");
        Matcher matcher;
        while ((matcher = pattern.matcher(inputExpression)).find()) {
            inputExpression = matcher.replaceAll("");
        }
        if (!(inputExpression.contains("(") || inputExpression.contains((")")))) {
            System.out.println("Expression is correct");
        } else {
            System.out.println("Expression is incorrect");
        }
    }
}