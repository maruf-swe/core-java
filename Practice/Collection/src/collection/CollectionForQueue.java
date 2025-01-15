package collection;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionForQueue {
    public static void main(String[] args) {
        // Declare a Queue of Strings
        Queue<String> tasks = new LinkedList<>();

        // Add elements
        tasks.add("Task 1");
        tasks.add("Task 2");

        // Retrieve and remove elements
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll()); // Retrieves and removes the head of the queue
        }
    }
}
