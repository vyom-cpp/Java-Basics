package Functions_and_Methods.pracQue;

import java.util.Scanner;

public class ans1 {
    public static float average(float num1, float num2, float num3){
        return (num1 + num2 + num3) / 3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat(); 
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();
        float result = average(a, b, c);
        System.out.println(result);
    }
}