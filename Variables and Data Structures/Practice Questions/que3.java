// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;
import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencilPrice = sc.nextFloat();
        float penPrice = sc.nextFloat();
        float eraserPrice = sc.nextFloat();

        float bill = (penPrice + pencilPrice + eraserPrice);
        System.out.println("Bill is: " +bill);

        // Adding 18% GST
        float newTotal = bill + (0.18f * bill);
        System.out.println("Bill with 18% tax : " + newTotal);
    }   
}
