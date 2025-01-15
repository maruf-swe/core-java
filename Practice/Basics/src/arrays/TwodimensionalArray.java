package arrays;

public class TwodimensionalArray {
    public static void main(String[] args) {
        /*
        A multidimensional array in Java is essentially an array of arrays, where each element of the main array can hold another array.
        The most common type is the two-dimensional (2D) array, which is often visualized as a table or matrix.
        However, Java supports arrays with more than two dimensions as well.

        1. Declaration and Initialization
            a. Two-Dimensional Array
                Declaration:
                int[][] matrix;
                Initialization:
                matrix = new int[3][4]; // 3 rows and 4 columns

                Combined Declaration and Initialization:
                int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
                };

        */

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]);

        //Change Element Values
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 10;
        System.out.println(myNumbers[1][2]);

        //Loop through two-dimensional Array
        int[][] myNumbers2 = {{1, 2, 3, 4}, {10, 20, 30}};
        for (int i = 0; i < myNumbers2.length; i++) {
            for (int j = 0; j < myNumbers2[i].length; j++) {
                System.out.println(myNumbers2[i][j]);

            }
        }

    }
}
