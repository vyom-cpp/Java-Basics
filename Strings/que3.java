package Strings;

public class que3 {
    
    public static String subString(String str, int sI, int eI){
        String subStr = "";
        for(int i = sI; i < eI; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));
        // Ye abhi humne chutiya giri ki hai itna bekar ka function banake jabki Java me already hai substring ka function

        System.out.println(str.substring(0, 6));
    }
}
