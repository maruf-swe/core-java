package collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionForSet {
    public static void main(String[] args) {
        // Create a set
        Set<String> colors = new HashSet<>();

        // Add elements to the set
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // Duplicate, will not be added

        // Iterate through the set
        for (String color : colors) {
            System.out.println(color);
        }

        // Check if an element exists
        System.out.println(colors.contains("Blue")); // Output: true

        // Remove an element
        colors.remove("Green");

        // Print the set
        System.out.println(colors);
    }
}
