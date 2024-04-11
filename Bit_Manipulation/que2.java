package Bit_Manipulation;

import java.util.Scanner;

public class que2 {
    
    public static void oddOrEven(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        oddOrEven(num);
    }
}
