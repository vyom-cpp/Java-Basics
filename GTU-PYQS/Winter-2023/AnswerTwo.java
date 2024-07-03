// Question-1(c)

public class AnswerTwo {

    public static void main(String[] args) {
        int[] array = {5, 8, 12, 3, 19, 21, 7, 1, 9, 15};

        System.out.println("Addition of all elements: " + add(array));
        System.out.println("Maximum element: " + max(array));
        
        int key = 19;
        int index = search(array, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }

    public static int add(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int max(int[] array) {
        int maximum = array[0];
        for (int num : array) {
            if (num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}