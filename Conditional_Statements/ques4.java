package Conditional_Statements;
import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();
        sc.close();
        
        if(a>b && a>c){
            System.out.println("First number is greatest");
        } else if(b>a && b>c){
            System.out.println("Second number is greatest");
        } else {
            System.out.println("Third number is greatest");
        }
    }
}