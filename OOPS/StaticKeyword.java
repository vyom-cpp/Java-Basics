package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "IJSC";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    static int returnPercentage(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }

    String name;
    int roll_no;

    static String schoolName;

    // Setter
    void setName(String name){
        this.name = name;
    }

    // Getter
    String getName(){
        return this.name;
    }
}