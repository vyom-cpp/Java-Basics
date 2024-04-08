package Arrays;
import java.util.*;

public class que4 {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 35, 34, 76, 432, 2, 87};
        System.out.println("The largest value in the given array is: " + getLargest(numbers));
    }    
}
