package Patterns_Two;
import java.util.Scanner;

public class ans7 {
    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        solidRhombus(rows);
    }
}
