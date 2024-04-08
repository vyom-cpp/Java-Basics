package Arrays;
import java.util.*;

public class que5 {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            // comparisons
            if(numbers[mid] == key){ // right
                return mid;
            }
            if(numbers[mid] < key){ // left
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        sc.close();

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }  
}
