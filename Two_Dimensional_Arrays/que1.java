package Two_Dimensional_Arrays;

import java.util.Scanner;

public class que1 {
    
    public static boolean searchKey(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        // input
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Enter element at cell (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // function calling
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        sc.close();
        searchKey(matrix, key);
    }
}