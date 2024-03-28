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

    static void sum(int a, int b) {
        System.out.println(a + b);
    };

    static void subtract(int a, int b) {
        System.out.println(a - b);
    };

    static void multiply(int a, int b) {
        System.out.println(a * b);
    };

    static void divide(int a, int b) {
        System.out.println(a / b);
    };
};