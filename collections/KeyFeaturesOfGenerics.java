package collection;

public class KeyFeaturesOfGenerics {
    public static void main(String[] args) {


        /*

        Key Features of Generics

             1. Generic Classes

                Define classes that work with any type:

                class Box<T> {
                    private T value;

                    public void set(T value) {
                        this.value = value;
                    }

                    public T get() {
                        return value;
                    }
                }



             2. Generic Methods

                Create methods that accept or return generic types:

                public <T> void printArray(T[] array) {
                    for (T element : array) {
                        System.out.println(element);
                    }
                }


             3. Wildcards (?)


                Allow flexibility in working with unknown types:

                ? (Unbounded wildcard): Accepts any type.
                ? extends Type: Accepts Type or its subclasses.
                ? super Type: Accepts Type or its superclasses.
                Example:

                public void printList(List<?> list) {
                    for (Object item : list) {
                        System.out.println(item);
                    }
                }


             4. Bounded Type Parameters

                Restrict the type parameter to a specific type or its subclasses:
                class Box<T extends Number> { // T must be a subclass of Number
                    private T value;

                    public void set(T value) {
                        this.value = value;
                    }

                    public T get() {
                        return value;
                    }
                }

         */


    }
}
