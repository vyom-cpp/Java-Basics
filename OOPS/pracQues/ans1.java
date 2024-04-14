package OOPS.pracQues;
import java.util.*;

public class ans1 {
    public static void main(String[] args) {
        
    }    
}

class Complex {
    int real;
    int image;
    public Complex(int r, int i){
        real = r;
        image = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real + b.real), (a.image + b.image));
    }

    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real - b.real), (a.image - b.image));
    }

    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real * b.real) - (a.image * b.image)), ((a.real * b.image) + (a.real + b.image)));
    }
}

public void printComplex(){

}