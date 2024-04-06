package Functions_and_Methods;

public class ques11 {

    // Function for Binary to Decimal
    public static void binToDecimal(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum>0) {
            int lastDigit = binNum % 10;
            decNum += (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " +myNum + " = " +decNum);
    }

    public static void main(String[] args) {
        binToDecimal(111);
    }
}