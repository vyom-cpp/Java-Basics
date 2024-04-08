package Arrays;

public class kadanesAlgo {

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Maximum Subarray sum is " + ms);
    }
    
    public static void specialCaseKadanesAlgo(int numbers[]) {
        // Check if all numbers are negative
        boolean allNegative = true;
        for (int num : numbers) {
            if (num >= 0) {
                allNegative = false;
                break;
            }
        }

        if (allNegative) {
            int maxNegative = Integer.MIN_VALUE;
            for (int num : numbers) {
                maxNegative = Math.max(maxNegative, num);
            }
            System.out.println("Maximum Subarray sum is " + maxNegative);
        } else {
            kadanes(numbers);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);

        int numbers1[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        specialCaseKadanesAlgo(numbers1);

    }    
}