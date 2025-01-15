package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionForDeque {
    public static void main(String[] args) {
        // Declare a Deque of Doubles
        Deque<Double> values = new ArrayDeque<>();

        // Add elements at both ends
        values.addFirst(1.1);
        values.addLast(2.2);

        // Retrieve and remove elements from both ends
        System.out.println(values.removeFirst()); // Output: 1.1
        System.out.println(values.removeLast());  // Output: 2.2
    }
}
