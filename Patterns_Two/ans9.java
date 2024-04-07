package Patterns_Two;
import java.util.Scanner;

public class ans9 {
    public static void diamond(int n){
        // 1st half
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i)-1; j++){
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
        diamond(rows);
    }
}
