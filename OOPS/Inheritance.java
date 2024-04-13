package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

        Dog doggo = new Dog();
        doggo.eat();
        System.out.println(doggo.legs);
        System.out.println(doggo.breed);
    }
}

// Base Class
class Animal {
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

// Derived Class or Sub Class
class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}

// Single Level Inheritance
// Animal -> Fish

// Multi Level Inheritance
// Animal -> Mammals -> Dog
class Mammals extends Animal{
    int legs = 4;
}

class Dog extends Mammals{
    String breed = "Husky";
}

// By commenting the Fish class the rest of the code becomes the multi level inheritance and right now it is also the heirarchial inheritance as both classes Fish and Mammals are the derived classes of Animal

// Hybrid Inheritance
//          Animal
//          /   \ 
//       Fish   Mammals
//                \
//                Dog