package forloops;
    /*
    ** the for-each loop is preferred over the for loop when working with arrays and collections.

    for-each Loop Sytnax:
    for(dataType item : array) {
        ...
    }
    Here:
    array - an array or a collection
    item - each item of array/collection is assigned to this variable
    dataType - the data type of the array/collection
     */

public class ForEachLoops {
    public static void main(String[] args) {

        //Example 1: Print Array Elements

        int[] numbers = {3, 9, 5, -5};
        // for each loop
        for (int number : numbers) {
            System.out.println(number);
        }

        //Example 2: Sum of Array Elements

        int[] numbers2 = {3, 4, 5, -5, 0, 12};
        int sum = 0;
        // iterating through each element of the array
        for (int num : numbers2) {
            sum += num;
        }

        System.out.println("Sum = " + sum);

        // Example for loop Vs for-each loop

        // iterating through an array using a for loop
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }
        // iterating through an array using a for-each loop
        char[] vowels2 = {'a', 'e', 'i', 'o', 'u'};
        for (char item : vowels2) {
            System.out.println(item);
        }
    }
}