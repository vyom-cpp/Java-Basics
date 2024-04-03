// Check a number if it is prime or not
package Loops;
import java.util.*;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2){
            System.out.println("Prime jj che aa topa");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){ // n is multiple of i(i is not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("Number prime jj che");
            } else {
                System.out.println("Number prime nathi pikina");
            }
        }
    }    
}
