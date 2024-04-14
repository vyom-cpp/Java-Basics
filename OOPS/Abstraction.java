package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);         // It should work but don't know why the hell it is not working

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;
    
    Animal(){
        color = "brown";
        // System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor(){
        color = "Brown";
    }
    void walk() {
        System.out.println("Horse walks");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}