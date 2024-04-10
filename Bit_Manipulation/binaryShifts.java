package Bit_Manipulation;

public class binaryShifts {
    public static void main(String[] args) {
        // Binary Left Shift

        // a << b = a * 2^b
        System.out.println(5 << 2);

        // The binary left shift operator (<<) shifts the bits of a binary  number to the left by a specified number of positions.

        // Each bit is shifted to the left by the specified number of positions, and the vacant positions on the right are filled with zeros.


        // Binary Right Shift

        // a >> b = a / 2^b
        System.out.println(5 >> 2);

        // The binary right shift operator (>>) shifts the bits of a binary number to the right by a specified number of positions.

        // Each bit is shifted to the right by the specified number of positions, and the vacant positions on the left are filled according to the type of right shift.
    }
}
