package Loops;
import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        
        while (n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;
        }
        System.out.println();
    }    
}