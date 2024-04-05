package Functions_and_Methods;

public class ques8 {
    // Function with integer values as arguments
    public static int sum(int a, int b){
        return a+b;
    }

    // Function with float values as arguments
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 2));
        System.out.println(sum(3.2f, 4.8f));
    }
}
