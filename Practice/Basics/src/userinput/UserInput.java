package userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*
        * In Java, user input is typically handled using the Scanner class,
              which is part of the java.util package. This class allows you to capture input from the console.

         * Import the Scanner class:
            import java.util.Scanner;

         * Create a Scanner object:
         Scanner scanner = new Scanner(System.in);

         * Use appropriate methods to capture input:
        nextLine() for strings.
        nextInt() for integers.
        nextDouble() for floating-point numbers.
        next() for a single word.

        * Close the Scanner object: Always close the Scanner after use to free up resources:
        scanner.close();


          */

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Get user's salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Display the input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);

        // Close the Scanner
        scanner.close();
    }
}
