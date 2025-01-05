package arrays;

public class BasicArray {
    public static void main(String[] args) {
        /*
        Java arrays are fundamental data structures that store multiple values of the same type.

     @@ 1. Basics of Java Arrays
        Definition: A fixed-size, ordered collection of elements of the same type.
        Types:
        One-dimensional arrays: A single row of elements.
        Multidimensional arrays: Arrays with rows and columns (e.g., 2D arrays).

     @@ 2. Declaring Arrays
        // Declaration without initialization
        int[] array1;
        int array2[]; // Both are valid

        // Declaration with initialization
        int[] array3 = new int[5]; // Array with 5 elements, all initialized to 0
        int[] array4 = {1, 2, 3, 4, 5}; // Array with specified values

     @@ 3. Accessing and Modifying Elements
        Access elements using zero-based indexing.
        Modify elements by assigning values at specific indices.
        java
        Copy code
        int[] array = {10, 20, 30};
        System.out.println(array[0]); // Access: 10
        array[1] = 50;                // Modify
        System.out.println(array[1]); // Output: 50


     @@ 4. Length of Array
        The length of an array is accessed via the .length property.
        java
        Copy code
        int[] array = {1, 2, 3, 4};
        System.out.println(array.length); // Output: 4
        */

        int[] array1;                   // declare array
        array1 = new int[5];            // declare allocating memory
        int[] array3 = {1,2,3};         // declare with specified values
        int[] array5 = new int[5];      // Array with 5 elements, all initialized to 0


    }
}
