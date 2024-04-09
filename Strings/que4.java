package Strings;

public class que4 {
    // compareTo function vaprenge isme

    /*
     *      str1.compareTo(str2);
     *      0:  equal
     *      <0: -ve (str1<str2)
     *      >0: +ve (str1>str2)
    */

    // compareToIgnoreCase function use karna zyada fayde mand hai ye question me

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
