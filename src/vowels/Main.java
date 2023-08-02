package vowels;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word to count vowels: ");
        String word = scanner.next();

        System.out.println("The number of vowels in " + word + " is: " + numberOfVowels(word));
    }

    public static long numberOfVowels(String word) {
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        return Arrays.stream(word.split("")).filter(e -> vowels.contains(e)).count();
    }
}
