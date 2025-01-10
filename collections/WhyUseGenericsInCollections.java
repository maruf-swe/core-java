package collection;

public class WhyUseGenericsInCollections {
    public static void main(String[] args) {

        /*

        Generics and Their Purpose
  Generics allow you to define parameterized types in Java. They provide a way to specify a type when defining or using a collection.

         Advantages of Generics
            Strong Type Checking: Reduces runtime errors by catching them at compile-time.
            Improved Code Readability: Removes the need for casting, making code cleaner.
            Reusability: Write flexible and reusable code for different data types.
            Performance: Eliminates the overhead of typecasting, improving performance in some cases.

        When to Use Generics????
            When working with collections (List, Set, Map, etc.).
            When creating utility classes or methods that can work with any type (e.g., a stack, queue, or sorting algorithm).
            When you want to enforce type constraints and reduce runtime errors.



    ### Why Use Generics???

         1. Type Safety
            Generics ensure that only compatible types are added to a collection or processed by a method. For example:

            List<String> list = new ArrayList<>();
            list.add("Hello");
            // list.add(123); // Compile-time error: incompatible type
            Without generics, this error would only be caught at runtime.


         2. Eliminates Casting
            When retrieving elements from a collection, generics remove the need for explicit casting:

            // Without Generics
            List list = new ArrayList();
            list.add("Hello");
            String str = (String) list.get(0); // Explicit casting needed

            // With Generics
            List<String> list = new ArrayList<>();
            list.add("Hello");
            String str = list.get(0); // No casting needed

         3. Compile-Time Checking
            Generics catch errors at compile-time instead of runtime, making debugging easier:

            List<Integer> list = new ArrayList<>();
            list.add(10);
            // list.add("String"); // Compile-time error

          4. Code Reusability
            Generics allow you to write flexible and reusable code.
                 You can define generic methods or classes that work with any type:

                class Box<T> {
                    private T value;

                    public void set(T value) {
                        this.value = value;
                    }

                    public T get() {
                        return value;
                    }
                }

                public class Main {
                    public static void main(String[] args) {
                        Box<String> stringBox = new Box<>();
                        stringBox.set("Hello");

                        Box<Integer> intBox = new Box<>();
                        intBox.set(123);

                        System.out.println(stringBox.get());
                        System.out.println(intBox.get());
                    }
                }

         */
    }
}
