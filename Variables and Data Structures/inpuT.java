import java.util.*;
public class inpuT {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // Stores till the space, it ignores everything after space
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name); // It evven captures the space which is not done by .next()

        int number = sc.nextInt();
        System.out.println(number);
        
        float price = sc.nextFloat();
        System.out.println(price);

        // Inputs in Java
        //  1. next
        //  2. nextLine
        //  3. nextInt
        //  4. nextByte
        //  5. nextFloat
        //  6. nextDouble
        //  7. nextBoolean
        //  8. nextShort
        //  9. nextLong
    }
}