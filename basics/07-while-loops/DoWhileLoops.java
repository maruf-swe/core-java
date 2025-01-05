package whileloops;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        /*
        The loop will always be executed at least once, even if the condition is false,
        because the code block is executed before the condition is tested:

        # Syntax
        do {
            // code block to be executed
        }
        while (condition);
         */

        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 2);

        int num = 10;
        do {
            System.out.println(num);
            num--;
        } while (num > 2);

        //Example: User Input Validation
        Scanner scanner = new Scanner(System.in);
        int number;

        // Prompt the user for input until a valid number is entered
        do {
            System.out.print("Please enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);  // Check condition after the user input

        System.out.println("Thank you! You entered: " + number);


        // Example: Menu System (Repeating Until Exit)
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose Option 1");
                    break;
                case 2:
                    System.out.println("You chose Option 2");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (choice != 3);
    }
}