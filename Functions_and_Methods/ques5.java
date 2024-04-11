// Factorial
package Functions_and_Methods;

import java.util.Scanner;

public class ques5 {
    
    public static int factorial(int num){
        int fact = 1;
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
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        
        factorial(n);
    }
}
