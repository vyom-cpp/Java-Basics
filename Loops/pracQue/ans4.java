// Multiplication Table

package Loops.pracQue;
import java.util.*;

public class ans4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }    
}