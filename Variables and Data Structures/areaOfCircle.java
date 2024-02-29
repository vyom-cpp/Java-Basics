import java.util.*;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        // float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}


// Type Conversion Conditions
// a. type compaitable [byte->short->int->float->long->double]
// b. destination type size > source type size

// Type Casting
// float a = 25.0;
// int b = a; (It will show en error)
// int b = (int)a; (It will not show an error)

// Type Promotion in Expressions
// 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
// 2. If one operand is long, float or double the whole expression is promoted to long, float, or double respectively.
// Correct Type Promotion
// a. byte b = 5;
//    b = b * 2; (It is wrong)

// b. byte b = 5;
//    b = (byte)(b * 2); (It is correct)  