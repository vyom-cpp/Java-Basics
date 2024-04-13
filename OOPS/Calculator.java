package OOPS;

public class Calculator {
    public static void main(String[] args) {
        // Method Overloading (Compile time Polymorphism)
        // Calc calc = new Calc();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float)1.5, (float)2.4));
        // System.out.println(calc.sum(1, 2, 3));

        // Method Overriding (Run time Polymorphism)
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}

class Calc{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}