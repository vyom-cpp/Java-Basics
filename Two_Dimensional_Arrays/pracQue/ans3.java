package Two_Dimensional_Arrays.pracQue;

public class ans3 {
    
    public static void printMatrix(int matrix[][]){
        System.out.println("The Matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int row = 2, column = 3;
        int matrix[][] = { {2, 3, 7}, {5, 6, 7} };

        // Display original matrix
        printMatrix(matrix);

        // Transpose of the matrix
        int transpose[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transposed matrix
        printMatrix(transpose);
    }
}

// Dry Run

/*
 1. Initialization
        row is initialized to 2.
        column is initialized to 3.
        matrix is initialized as a 2x3 array:

        { {2, 3, 7},
          {5, 6, 7} }

 2. Display Original Matrix
        The printMatrix method is called with the matrix as an argument.
        The original matrix is displayed:

        The Matrix is:
        
        2  3  7  
        5  6  7  

 3. Transpose of Matrix
        An empty 3x2 array transpose is initialized.
        Nested loops iterate over each element of the original matrix.
        Each element of the original matrix is copied to the corresponding position in the transposed matrix, swapping rows and columns.
        The transposed matrix is filled as follows:

        { {2, 5},
          {3, 6},
          {7, 7} }

 4. Display Transposed Matrix
        The printMatrix method is called with the transpose matrix as an argument.
        The transposed matrix is displayed:

        The Matrix is:
        
        2  5  
        3  6  
        7  7  

 */