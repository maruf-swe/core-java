package javaoop.encapsulation;

public class BasicsOfEncapsulation {
    /*
Encapsulation is one of the core concepts of Object-Oriented Programming (OOP) in Java. It is the practice of wrapping
    the data (variables) and methods (functions) that operate on the data into a single unit called a class. This allows us
      to hide the internal state of an object from the outside world and only expose necessary parts of the object through methods.

In Java, encapsulation is achieved using access modifiers:

Private: Restricts access to the class itself (most commonly used for encapsulating data).
Public: Allows access from any class.
Protected: Allows access within the same package or subclasses.
Default (Package-Private): Allows access within the same package.
Encapsulation uses getter and setter methods to access and modify the private variables.

Why is Encapsulation Needed?

Data Hiding: By making variables private, the internal state of an object is hidden from other classes. This prevents
    direct access and modification of the object’s fields, making sure the object’s state is not corrupted.

Control over Data: Through getter and setter methods, you can control how the data is accessed or updated. For example,
    you can validate input before updating a field or apply business logic.

Improved Maintainability: Encapsulation helps in making the code more modular and easier to maintain. If you need to change
    the internal structure or logic, you can do so without affecting other parts of the program that rely on the class.

Increased Flexibility: By encapsulating data, you can change the internal implementation of the class without changing its
    external interface. This improves flexibility and reduces dependencies.

Security: It enhances security by preventing unintended changes to data. By providing controlled access to data through methods,
    you can ensure only valid data is set.

    Benefits of Encapsulation:
Protects Object Integrity: By controlling how data is accessed and modified, it ensures that the object’s state is always valid.
Flexibility in Changing Code: If the internal implementation needs to change, you can modify it without affecting how other
    parts of the program interact with the object.
Improved Code Readability and Maintainability: Encapsulation allows you to structure your code more logically, making it easier to maintain and extend.
Easier Debugging: If something goes wrong with an object's state, encapsulation allows you to pinpoint and control where changes are made.

     */
}
