package primenumbers;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while(count < 10) {
            if(numberIsPrime(number)) {
                System.out.println(number + " is a prime number");
                count++;
            }

            number++;
        }
    }

    public static boolean numberIsPrime(double number) {
        if (number < 2) return false;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }

        return true;
    }
}
