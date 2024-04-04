// Functions syntax with Parameters

package Functions_and_Methods;

import java.util.Scanner;

public class ques2 {
    public static int calculateSum(int num1, int num2){ // Paramters or formal parameters (declared during the function definition)
        int sum = num1+num2;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // Arguments or actual parameters (declared during the function call)
        System.out.println("Sum is " + sum);
    }
}