package Conditional_Statements;
import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        float marks = sc.nextFloat();
        sc.close();
        
        String reportCard = marks >= 33 ? "Pass" : "Fail";
        System.out.println(reportCard);
    }
}