// Operations in bits (clear ith bit operation)
package Bit_Manipulation;

public class que5 {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
}
