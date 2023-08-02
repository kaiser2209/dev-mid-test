package factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long number = scanner.nextLong();

        System.out.println("The factorial for " + number + " is: " + factorial(number));
    }

    public static long factorial(long number) {
        if(number < 0) {
            System.out.println("Error");
            return 0;
        }
        if(number == 0) return 1;
        return number * factorial(number - 1);
    }

}
