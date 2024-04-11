package Conditional_Statements;
import java.util.*;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day (1-7): ");
        int day = sc.nextInt();
        sc.close();
        
        String dayString;

        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;
            default:
                dayString = "Invalid day";
        }

        System.out.println("The day is: " + dayString);
    }
}
