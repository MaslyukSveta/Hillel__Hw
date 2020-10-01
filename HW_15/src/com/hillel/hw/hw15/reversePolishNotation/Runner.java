package com.hillel.hw.hw15.reversePolishNotation;

public class Runner {

    public static void main(String [] args) {
        String state = "A+B*(C%D-E)";
        System.out.println(state);
        System.out.println(com.hillel.hw.hw15.reversePolishNotation.Worker.turnToPostfix(state));
        double result = com.hillel.hw.hw15.reversePolishNotation.Worker.calculate(InfixToPostfix.turnToPostfix(state), 1, 2, 3, 4, 5);
        System.out.println(result);
        System.out.println(1 + 2 * (3 % 4 - 5));
    }
}
