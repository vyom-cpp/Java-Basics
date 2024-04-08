package Two_Dimensional_Arrays.pracQue;

public class ans2 {
    public static void main(String[] args) {
        int nums[][] = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3} };
        int sum = 0;

        // Sum of 2nd row elements
        for(int j = 0; j < nums[0].length; j++){
            sum += nums[1][j];
        }
        System.out.println("Sum is " + sum);
    }
}

// Dry Run

/*
 1. Initialization 
        nums is initialized as a 3x3 array:
        
        { {1, 4, 9},
          {11, 4, 3},
          {2, 2, 3} }

        sum is initialized to 0.

 2. Sum of 2nd Row Elements
        The loop iterates over each element of the 2nd row (index 1) of the nums array.
        For each element, its value is added to the sum variable.
        The elements of the 2nd row are {11, 4, 3}, so the sum is 11 + 4 + 3 = 18.
 3. Output 
        The sum calculated is printed to the console:
        Sum is 18

 */