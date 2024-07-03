// Question-1(b)

import java.util.Scanner;

public class AnswerOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        displayFirstNPrimes(n);
    }

    public static void displayFirstNPrimes(int n) {
        int count = 0;
        int num = 2;
        System.out.println("The first " + n + " prime numbers are:");
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}