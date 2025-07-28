package basic;

import java.util.Scanner;

public class Squreroot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        // Display square roots from 1 to n
        System.out.println("\nSquare roots from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            double sqrt = Math.sqrt(i);
            System.out.printf("√%d = %.4f\n", i, sqrt);
        }

        input.close();
    }
}
