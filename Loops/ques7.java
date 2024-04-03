// Keep entering numbers until the multiple of 10 is not arrived
package Loops;
import java.util.*;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            };
            System.out.println(n);
        }while(true);
    }
}