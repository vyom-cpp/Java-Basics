package Loops;
import java.util.*;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            sc.close();
            
            if(n%10==0){
                continue;
            };
            System.out.println("Number was: " +n);
        }while(true);
    }
}