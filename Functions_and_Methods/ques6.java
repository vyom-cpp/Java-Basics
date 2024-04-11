package Functions_and_Methods;

public class ques6 {
    public static int factorial(int num){
        int fact = 1;
        if(num<0){
            System.out.println("Wrong input");
        } else if(num==0 || num==1){
            // System.out.println("Factorial = 1");
            return 1;
        } else {
            for(int i=1; i<=num; i++){
                fact*=i;
            }
            // System.out.println("Factorial = " + fact);
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n/(fact_r * fact_nmr);
        return bincoeff;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // factorial(n);
        // System.out.println(binCoeff(5, 4));
        int ans = binCoeff(5, 4);
        System.out.println("Binomial Coefficient is " + ans);
    }
}
