import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        if (args[0].equals("sum")) {
            sum(a, b);
        } else if (args[0].equals("subtract")) {
            subtract(a, b);
        } else if (args[0].equals(("multiply"))) {
            multiply(a, b);
        } else if (args[0].equals("divide")) {
            divide(a, b);
        } else {
            System.out.println("Invalid input!");
        };
    };

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation: ");
        System.out.println("1. Sum");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int operation = scanner.nextInt();

        switch(operation) {
            case 1:
                handleUserInput();
        }
    }

    public static void handleUserInput() {

    }

    static double sum(int a, int b) {
        double sum = a + b;
        System.out.println(sum);
        return sum;
    };

    static double subtract(int a, int b) {
        double subtract = a - b;
        System.out.println(subtract);
        return subtract;
    };

    static double multiply(int a, int b) {
        double multiply = a * b;
        System.out.println(multiply);
        return multiply;
    };

    static double divide(int a, int b) {
        double divide = (double) a / b;
        System.out.println(divide);
        return divide;
    };
};