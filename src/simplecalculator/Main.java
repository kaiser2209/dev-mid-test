package simplecalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first, second;
        String operator;

        System.out.print("Please enter the first number: ");
        first = scanner.nextDouble();
        System.out.print("\nPlease enter the second number: ");
        second = scanner.nextDouble();
        System.out.print("\nPlease enter the calculator operation('+, -, /, *'): ");
        operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid operator. Please try again!");
        }

    }
}
