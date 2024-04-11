// Operations in bits (set ith bit operation)
package Bit_Manipulation;

public class que4 {
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask; 
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
