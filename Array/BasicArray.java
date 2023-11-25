package array;

/*
    Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    To declare an array, define the variable type with square brackets:

 */

public class BasicArray {
    public static void main(String[] args) {
        // declare Array of String
        String[] cars = {"BMW", "Mercedes", "Volvo"};

        // declare array of Int

        int[] numbers = {1,2,3,4,5};

        // Access the element of Array
        System.out.println(cars[1]);

        // Change the Array element
        numbers[2] = 10;
        System.out.println(numbers[2]);

        // Array of Length
        System.out.println(numbers.length);
    }
}
