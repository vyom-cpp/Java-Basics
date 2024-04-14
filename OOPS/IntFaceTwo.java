package OOPS;

public class IntFaceTwo {
    public static void main(String[] args) {
       Bear b = new Bear();
       b.eat(); 
    }
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void eat();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("Counted as both Herbivore and Carnivor");
    }
}