import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the number of elements you want to add:");
        
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted elements in descending order:");

        for (int num : numbers) {
            System.out.println(num);
        }
        scanner.close();
    }
}