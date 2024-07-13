import java.util.*;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("Choose operation: ");
        System.out.println("1. Sum");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int operation = scanner.nextInt();
        handleUserInput(operation);
    }
    public static void handleUserInput(int operation) {
        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        switch(operation) {
            case 1:
            sum(firstNumber, secondNumber);
            break;
            case 2:
            subtract(firstNumber, secondNumber);
            break;
            case 3:
            multiply(firstNumber, secondNumber);
            break;
            case 4:
            divide(firstNumber, secondNumber);
            break;
        }
    }

    static double sum(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
        return sum;
    }

    static double subtract(double a, double b) {
        double subtract = a - b;
        System.out.println(subtract);
        return subtract;
    }

    static double multiply(double a, double b) {
        double multiply = a * b;
        System.out.println(multiply);
        return multiply;
    }

    static double divide(double a, double b) {
        double divide = (double) a / b;
        System.out.println(divide);
        return divide;
    }

    public static void main(String[] args) {
        displayMenu();
    }
}