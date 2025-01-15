package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionForMap {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        // Access a value by its key
        System.out.println(students.get(2)); // Output: Bob

        // Iterate through the map
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remove a key-value pair
        students.remove(1);

        // Print the map
        System.out.println(students);


    }
}
