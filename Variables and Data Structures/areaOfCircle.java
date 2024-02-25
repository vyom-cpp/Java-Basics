import java.util.*;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        // float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}
