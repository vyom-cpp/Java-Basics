package Strings;

public class que1 {
    
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Vyom";
        String lastName = "Sutariya";
        String fullName = firstName + " " + lastName;
        // Concetenation
        System.out.println("My name is " + fullName);
        System.out.println();

        printLetters(fullName);
    }
}
