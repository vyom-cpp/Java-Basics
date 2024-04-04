package Functions_and_Methods;

import java.util.Scanner;

public class ques4 {
    public static int calculateProduct(int num1, int num2){
        int product =  num1 * num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a  = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int prod = calculateProduct(a, b);
        System.out.println("a * b = " + prod);
    }
}
