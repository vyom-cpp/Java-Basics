// OR Q-3(c)

import java.util.Scanner;
import java.util.Arrays;

public class AnswerFive {
    private String[] name;

    public AnswerFive() {
        name = new String[10];
    }

    public void takeInput(Scanner scanner) {
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < name.length; i++) {
            name[i] = scanner.nextLine();
        }
    }

    public int search(String s) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {
        Arrays.sort(name);
        System.out.println("સૉર્ટ કરેલ શબ્દમાળાઓ:"); // Sorted Strings
        for (String str : name) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnswerFive af = new AnswerFive();
        af.takeInput(scanner);

        System.out.println("શોધવા માટે એક શબ્દમાળા દાખલ કરો:"); // Enter a string to search:
        String searchString = scanner.nextLine();
        int index = af.search(searchString);

        if (index != -1) {
            System.out.println("અનુક્રમણિકા પર સ્ટ્રિંગ મળી: " + index); // String found at index
        } else {
            System.out.println("String મળ્યું નથી"); // String not found
        }

        af.sort();
        scanner.close();
    }
}