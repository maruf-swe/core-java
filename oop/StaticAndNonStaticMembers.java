package javaoop;

public class StaticAndNonStaticMembers {
    public static void main(String[] args) {
        /*

        Static and Non-Static in OOP (Short Notes)

        ### Static Members:  ###

*Declared using the static keyword.
*Belong to the class, not any specific object.
*Shared across all objects of the class (single memory allocation).
*Accessed using the class name without creating an object.
*Commonly used for constants, utility methods, or shared resources.

Example1:
class Example {
    static int count = 0; // Static variable

    static void displayCount() { // Static method
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Example.count = 5; // Access static variable
        Example.displayCount(); // Call static method
    }
}

        ### Non-Static Members:  ###

*Non-Static Members:
*Declared without the static keyword.
*Belong to individual objects of the class.
*Each object has its own copy of non-static members.
*Accessed using an object of the class.
*Commonly used for properties and methods specific to individual objects.
Example 2:
class Example {
    int value; // Non-static variable

    void displayValue() { // Non-static method
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(); // Create object
        obj.value = 10; // Access non-static variable
        obj.displayValue(); // Call non-static method
    }
}

    Key Differences:

Feature                   	Static	                                    Non-Static

Belongs to	                 Class	                                Instance (object).
Access	             Directly via class name.	                    Requires an object.
Memory Allocation	 Once when the class is loaded.                 Per object created.

Combination Example of Static & Non-Static Members:
class Example {
    static int staticVar = 10;
    int nonStaticVar = 20;

    static void staticMethod() {
        System.out.println("Static Variable: " + staticVar);
        // System.out.println(nonStaticVar); // Error: Cannot access non-static variable
    }

    void nonStaticMethod() {
        System.out.println("Non-Static Variable: " + nonStaticVar);
        System.out.println("Static Variable: " + staticVar); // Static accessible here
    }
}

public class Main {
    public static void main(String[] args) {
        Example.staticMethod(); // Access static method

        Example obj = new Example(); // Create object
        obj.nonStaticMethod(); // Access non-static method
    }
}


         */
    }
}
