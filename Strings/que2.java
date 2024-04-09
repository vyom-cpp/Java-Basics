package Strings;

public class que2 {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // All of these have same value

        if (s1 == s2) { // Return True
            System.out.println("Same");
        } else {
            System.out.println("Diffelent");
        }

        if (s1 == s3) { // This will return false
            System.out.println("Same");
        } else {
            System.out.println("Diffelent");
        }

        // To compare only values, use .equals
        if (s1.equals(s3)) { // This will return true
            System.out.println("Same");            
        } else {
            System.out.println("Diffelent");
        }
    }
}
