// Inverted half pyramid with numbers
package Patterns_Two;
import java.util.Scanner;;
public class ans3 {
    public static void invertedHalfPyramidWithNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        invertedHalfPyramidWithNumbers(rows);
    }
}
