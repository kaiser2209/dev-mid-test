package gradeaverage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> subjects = new ArrayList<>();

        while(subjects.size() < 3) {
            System.out.print("Please enter the grade of the subject " + (subjects.size() + 1) + ": ");
            subjects.add(scanner.nextDouble());
        }


        System.out.println("The average is: " + subjects.stream().mapToDouble(v -> v.doubleValue()).average().orElse(0));
    }
}
