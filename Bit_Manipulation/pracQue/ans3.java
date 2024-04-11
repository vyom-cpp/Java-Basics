package Bit_Manipulation.pracQue;

public class ans3 {
    public static void main(String[] args) {
        // Convert uppercase character to lower case
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println((char)(ch | ' '));
        }
    }   
}