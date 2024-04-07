package Patterns_Two;
import java.util.Scanner;

public class ans8 {
    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=n; j++){
                // Print stars only on the first and last rows, and on the edges
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        hollowRhombus(rows);
    }
}