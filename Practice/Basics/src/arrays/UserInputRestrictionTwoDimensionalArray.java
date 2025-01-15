package arrays;

import java.util.Scanner;

public class UserInputRestrictionTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for rows and columns
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] array_numbers = new int[rows][cols];
        sc.nextLine(); // Consume the remaining newline character

        // Input for array values
        System.out.println("Enter the array values row by row:");

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter " + cols + " values for row " + (i + 1) + " (space-separated):");

            String[] inputValues = sc.nextLine().split(" "); // Read a line and split by spaces
            while (inputValues.length != cols) { // Ensure the correct number of values is entered
                System.out.println("Invalid input! Please enter exactly " + cols + " values:");
                inputValues = sc.nextLine().split(" ");
            }

            // Parse and store the values in the array
            for (int j = 0; j < cols; j++) {
                array_numbers[i][j] = Integer.parseInt(inputValues[j]);
            }
        }

        // Printing the array
        System.out.println("The entered array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array_numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
