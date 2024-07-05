import java.util.ArrayList;
import java.util.List;

class Demo {
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + this.name);
    }
}

public class KeywordDemo {
    public static void main(String[] args) {
        Demo demo = new Demo("Example");
        demo.printName();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                continue;
            }
            if (number > 7) {
                break;
            }
            System.out.println("Number: " + number);
        }
    }
}