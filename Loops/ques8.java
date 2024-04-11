package Loops;

public class ques8 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }
        System.err.println("3 number skip kar diya bhenchod");
    }    
}