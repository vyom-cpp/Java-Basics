package Arrays;
import java.util.*;

public class que1 {
    public static void main(String[] args) {
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Length of an array = " + marks.length);

        System.out.print("Enter marks of Physics: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter marks of Chemistry: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter marks of Maths: ");
        marks[2] = sc.nextInt();
        sc.close();
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");
    }
}