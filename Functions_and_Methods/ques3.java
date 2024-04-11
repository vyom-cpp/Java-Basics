package Functions_and_Methods;

import java.util.Scanner;

public class ques3 {
    
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping");
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        sc.close();
        
        swap(a, b); // Call by value
    }
}
// Java always call by value