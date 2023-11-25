package array;

//Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]);

        //Change Element Values
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 10;
        System.out.println(myNumbers[0][2] = 10);

        //Loop through multidimensional Array
        int[][] myNumbers2 = {{1, 2, 3, 4}, {10, 20, 30}};
        for (int i = 0; i < myNumbers2.length; i++) {
            for (int j = 0; j < myNumbers2[i].length; j++) {
                System.out.println(myNumbers2[i][j]);

            }
        }


    }
}
