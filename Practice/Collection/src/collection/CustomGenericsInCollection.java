package collection;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class CustomGenericsInCollection {
    public static void main(String[] args) {
        // Create a Box for Strings
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");

        // Create a Box for Integers
        Box<Integer> intBox = new Box<>();
        intBox.set(123);

        // Use the boxes in a list
        List<Box<?>> boxes = new ArrayList<>(); // Wildcards (?) are used when you don't know the exact type or want flexibility.
        boxes.add(stringBox);
        boxes.add(intBox);

        // Retrieve and print box values
        for (Box<?> box : boxes) {
            System.out.println(box.get());
        }
    }
}
