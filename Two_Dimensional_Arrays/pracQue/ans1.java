package Two_Dimensional_Arrays.pracQue;

public class ans1 {
    public static void main(String[] args) {
        int array[][] = { {4, 7, 8}, {8, 8, 7} };

        int countOf7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        // Printing the count of 7
        System.out.println("Count of 7 is " + countOf7);
    }
}

// Dry Run

/*
 1. Initialization 
        array is initialized as a 2x3 array

        { {4, 7, 8},
          {8, 8, 7} }

        countOf7 is initialized to 0.

 2. Count of 7
        Nested loops iterate over each element of the array.
        For each element, if the value is 7, countOf7 is incremented.
        The elements of the array are:

        4  7  8
        8  8  7

        The count of occurrences of 7 is 2.

 3. Output 
        The count of occurrences of 7 is printed to the console:
        Count of 7 is 2

 */