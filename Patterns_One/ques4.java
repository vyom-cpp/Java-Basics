package Patterns_One;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        char ch = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}