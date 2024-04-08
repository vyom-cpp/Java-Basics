package Arrays;
import java.util.*;

public class que3 {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
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
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }    
}
