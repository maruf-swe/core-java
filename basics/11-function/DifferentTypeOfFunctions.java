package function;

public class DifferentTypeOfFunctions {
    // Method with no parameters and no return value
    public void sayHello() {
        System.out.println("Hello!");
    }

    // Method with parameters
    public void greetUser(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    // Method with a return value
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Creating an object to call methods
        DifferentTypeOfFunctions example = new DifferentTypeOfFunctions();

        // Calling methods
        example.sayHello();
        example.greetUser("Alice");
        int result = example.multiply(5, 3);
        System.out.println("Multiplication result: " + result);
    }
}
