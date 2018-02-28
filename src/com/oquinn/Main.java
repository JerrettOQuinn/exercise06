package com.oquinn;


import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        int userInt = Integer.parseInt(userInput);

        return userInt;
    }

    public String promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();
        String aString = userInput;


        return aString;
    }

    public double promptDouble(String message) {
        System.out.println(message);
        double userInput = scanner.nextDouble();
        double aDouble = userInput;

        return aDouble;
    }
}


public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        System.out.println("Your integer is " + aNumber);
        String aString = input.promptString("Enter a string.");
        System.out.println("Your string is " + aString);
        double aDouble = input.promptDouble("Enter a double.");
        System.out.println("Your double is " + aDouble);
    }
}
