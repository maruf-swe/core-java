package arrays;

import java.util.Scanner;

public class UserInputTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for rows and columns
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] array_numbers = new int[rows][col];

        // Input for array values
        System.out.println("Enter the array values row by row:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                array_numbers[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        System.out.println("The entered array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array_numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}
