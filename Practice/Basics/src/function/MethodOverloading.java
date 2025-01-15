package function;

public class MethodOverloading {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply a double and an integer
    public double multiply(double a, int b) {
        return a * b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to subtract three integers
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Main method to test all overloaded methods
    public static void main(String[] args) {
        MethodOverloading mathOps = new MethodOverloading();

        // Calling add methods
        System.out.println("Addition of 5 and 10: " + mathOps.add(5, 10));
        System.out.println("Addition of 5, 10, and 15: " + mathOps.add(5, 10, 15));
        System.out.println("Addition of 5.5 and 10.5: " + mathOps.add(5.5, 10.5));

        // Calling multiply methods
        System.out.println("Multiplication of 5 and 10: " + mathOps.multiply(5, 10));
        System.out.println("Multiplication of 5, 10, and 15: " + mathOps.multiply(5, 10, 15));
        System.out.println("Multiplication of 5.5 and 10: " + mathOps.multiply(5.5, 10));

        // Calling subtract methods
        System.out.println("Subtraction of 10 and 5: " + mathOps.subtract(10, 5));
        System.out.println("Subtraction of 10, 5, and 2: " + mathOps.subtract(10, 5, 2));
    }
}
