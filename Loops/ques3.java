// Sum of first n numbers
package Loops;
import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        
        int i = 1;
        int sum = 0;
        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }   
}