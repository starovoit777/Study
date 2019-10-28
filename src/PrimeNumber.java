import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter positive integer");

        if (scanner.hasNextInt()) {
            int entered = scanner.nextInt();
            if (entered <= 0) {
                System.out.println("The number is not positive");
            } else {
                if (entered == 1 || entered == 2) {
                    System.out.println("The number is prime");
                } else {
                    for (int i = 2; i < entered; i++) {
                        if (entered % i == 0) {
                            System.out.println("The number is not prime");
                            break;
                        } else {
                            if (i == entered-1) System.out.println("The number is prime");
                        }
                    }
                }
            }
        } else {
            System.out.println("This is not an integer");
        }
    }
}