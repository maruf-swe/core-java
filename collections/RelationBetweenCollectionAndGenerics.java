package collection;

public class RelationBetweenCollectionAndGenerics {
    /*
    The relationship between Collections and Generics in Java is that Generics provide type safety and flexibility to
           the Collections Framework. Here's a detailed explanation:

1. Collections and Their Purpose
Collections are data structures in Java that group and manage objects, such as List, Set, Queue, etc.
Prior to Java 5 (when Generics were introduced), Collections could hold any type of object, leading to potential
    runtime type errors and the need for explicit typecasting.
2. Generics and Their Purpose
Generics allow you to define parameterized types in Java. They provide a way to specify a type when defining or using a collection.
Generics ensure compile-time type safety, reducing runtime errors and eliminating the need for explicit typecasting.
Relationship Between Collections and Generics
Before Generics (Java 1.4 and earlier)
Collections could hold any type of object (Object), and typecasting was required when retrieving elements:

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // Raw type
        list.add("Hello");
        list.add(123); // No error at compile time

        String str = (String) list.get(0); // Explicit casting needed
        Integer num = (Integer) list.get(1); // Explicit casting needed
    }
}
Problems:

No type safety: A collection could hold incompatible types.
Typecasting was error-prone and cumbersome.
With Generics (Java 5 and later)
Generics enforce type safety at compile-time:

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Type-safe collection
        list.add("Hello");
        // list.add(123); // Compile-time error: incompatible type

        String str = list.get(0); // No casting needed
        System.out.println(str);
    }
}
Benefits:

Type Safety: Prevents adding incompatible types to the collection.
No Casting: Eliminates the need for explicit typecasting when retrieving elements.
Better Code Readability and Maintenance.
How Generics Work with Collections
1. Generic Type Parameter
The Java Collections Framework uses Generics to define the type of elements it can hold:

CollectionType<ElementType> collectionName = new ImplementationClass<>();
Examples:

List<String> list = new ArrayList<>();
Set<Integer> set = new HashSet<>();
Map<Integer, String> map = new HashMap<>();
2. Commonly Used Collection Types with Generics
List: Ordered collection (e.g., List<String> for strings).
Set: Unique elements (e.g., Set<Integer> for integers).
Map: Key-value pairs (e.g., Map<String, Double> for names and prices).
Key Features of Generics in Collections
1. Compile-Time Type Safety
Generics prevent adding elements of the wrong type:

List<String> list = new ArrayList<>();
list.add("Hello");
// list.add(123); // Compile-time error
2. Eliminate Explicit Casting
Without Generics:


List list = new ArrayList();
list.add("Hello");
String str = (String) list.get(0); // Casting required
With Generics:


List<String> list = new ArrayList<>();
list.add("Hello");
String str = list.get(0); // No casting needed
3. Reusability with Parameterized Types
Generics allow writing reusable code:

public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
This Box class can hold any type, including collections.

Example: Combining Collections and Generics

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        // names.add(123); // Compile-time error

        for (String name : names) {
            System.out.println(name);
        }
    }
}
Conclusion
The relationship between Collections and Generics is symbiotic:

Collections provide the structure to store and manipulate data.
Generics add type safety and flexibility to Collections, ensuring error-free and maintainable code.
Generics have fundamentally improved the usability of Collections in Java by ensuring compile-time safety and making
  the code cleaner and more robust.

     */
}
