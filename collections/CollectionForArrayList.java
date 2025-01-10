package collection;

import java.util.List;

public class CollectionForArrayList {
    public static void main(String[] args) {
        // Create a list
        List<String> fruits = new java.util.ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Access an element
        System.out.println(fruits.get(1)); // Output: Banana

        // Iterate through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element
        fruits.remove("Banana");

        // Print the list
        System.out.println(fruits);
    }
}
