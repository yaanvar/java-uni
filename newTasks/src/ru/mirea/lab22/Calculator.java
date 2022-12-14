package ru.mirea.lab22;
import java.util.Stack;

public class Calculator {

    public static double fromPolandToNormal(String stPolandInput) throws EmptyStackException, DivisionByZeroException {
        Double result = 0d;

        String currentPosition = "";
        Stack<Double> currentStack = new Stack<>();
        for (int i = 0; i < stPolandInput.length(); i++) {
            if (isOperand(((Character) stPolandInput.charAt(i)).toString())) {
                if (currentStack.size() < 2) throw new EmptyStackException();
                result = operationResult(currentStack.pop(), currentStack.pop(), ((Character) stPolandInput.charAt(i)).toString());
                currentStack.push(result);
            } else if (stPolandInput.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")) {
                currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                currentPosition = "";
            } else {
                currentPosition += stPolandInput.charAt(i);
            }
        }
        return (currentStack.empty()) ? 0 : currentStack.pop();
    }

    public static boolean isOperand(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static Double operationResult(Double firstNum, Double secondNum, String operand) throws DivisionByZeroException {
        if (operand.equals("/") && firstNum == 0) throw new DivisionByZeroException();
        switch (operand) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return secondNum - firstNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return secondNum / firstNum;
        }
        return 0d;
    }

    public static void main(String[] args) throws EmptyStackException {
        try {
            System.out.println(fromPolandToNormal("2.3 5 +"));
            System.out.println(fromPolandToNormal("2 3 * 4 5 * +"));
            System.out.println(fromPolandToNormal("2 3 4 5 6 * + - /"));
            System.out.println(fromPolandToNormal("2 0 /"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}