import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the first number:");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the second number:");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter an operator (+, -, *, /):");
            char operator = scanner.nextLine().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }

            System.out.println("The result is: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
