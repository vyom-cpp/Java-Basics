// Convert Decimal to Binary
package Functions_and_Methods;

public class ques12 {

    // Function to convert Decimal to Binary
    public static void decToBinary(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n>0) {
            int rem = n%2;
            binNum += (rem * (int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        decToBinary(7);
    }
}