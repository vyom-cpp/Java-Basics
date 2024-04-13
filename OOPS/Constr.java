package OOPS;

public class Constr {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Student s1 = new Student("Vyom");
        @SuppressWarnings("unused")
        Student s2 = new Student();
        @SuppressWarnings("unused")
        Student s3 = new Student(139);
        
        // System.out.println(s1.name);
        // System.out.println();
        // System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;

    // Non-Parameterized Constructor
    Student(){
     System.out.println("Hellu");
    }

    // Parameterized Constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}