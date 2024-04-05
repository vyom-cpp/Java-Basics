// If the number is prime or not using functions
package Functions_and_Methods;

public class ques9 {
    // For numbers greater or equal to 2
    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        
        boolean isPrime = true;
        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
}
