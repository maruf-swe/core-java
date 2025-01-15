package collection;

public class BasicsOfCollection {
    public static void main(String[] args) {
        /*

  ***** Collections and Their Purpose
            Collections are data structures in Java that group and manage objects, such as List, Set, Queue, etc.
             Prior to Java 5 (when Generics were introduced), Collections could hold any type of object,
                    leading to potential runtime type errors and the need for explicit typecasting.


        1. Basic Structure for Declaring a Collection
            The general syntax for declaring a collection is:

            CollectionType<ElementType> collectionName = new ImplementationClass<>();

            CollectionType: The interface type (e.g., List, Set, Map).
            ElementType: The type of elements the collection will store (e.g., String, Integer).
            ImplementationClass: The specific implementation of the interface (e.g., ArrayList, HashSet, HashMap).

         */


        /*
         Why Use Generics in Collections?
            Type Safety: Prevents adding incompatible types to the collection.
            No Casting Needed: Eliminates the need for explicit casting when retrieving elements.
            Compile-Time Checking: Detects errors during compilation instead of runtime.
         */


    }
}