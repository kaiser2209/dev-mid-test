package interestcalculation;

import java.text.Format;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your initial capital: ");
        double capital = scanner.nextDouble();
        System.out.print("Please enter the interest rate (e.g: 1.25): ");
        double rate = scanner.nextDouble();
        System.out.print("Please enter the investment time (in months): ");
        int months = scanner.nextInt();

        System.out.printf("The final value is: %.2f", calculateInvestment(capital, rate, months));
    }

    public static double calculateInvestment(double value, double rate, int months) {
        return value * Math.pow((1 + rate / 100), months);
    }
}
