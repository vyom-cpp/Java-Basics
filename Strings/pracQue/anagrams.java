package Strings.pracQue;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // Converting strings to lowercase to no need to check agains for the captial letters
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are same
        if(str1.length() == str2.length()) {

            // Convert string into character array
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            // Sorting the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // If the sorted character arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
            }
        } else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
    }
}
