// Factorial
package Loops.pracQue;
import java.util.*;

public class ans3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Wrong input");
        } else if(num==0 || num==1){
            System.out.println("Factorial = 1");
        } else {
            for(int i=1; i<=num; i++){
                fact*=i;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}