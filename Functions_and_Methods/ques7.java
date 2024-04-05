package Functions_and_Methods;

public class ques7 {
    // Function to calculate sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }

    // Function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 1));
        System.out.println(sum(10, 2, 45));
    }
}
