package basic;

public class BasicExceptionHandaling {
    public static void main(String[] args) {
        /*
        1. What is an Exception?
        An exception is an event that disrupts the normal flow of a program's instructions. It can be caused by various factors, such as incorrect user input, hardware failure, or programming bugs.

        2. Types of Exceptions:
        Checked Exceptions: Exceptions that are checked at compile-time. The compiler ensures these exceptions are either caught or declared in the method signature.
                Example: IOException, SQLException
        Unchecked Exceptions: Exceptions that occur at runtime, and are not checked by the compiler. These are typically caused by programming bugs.
                Example: NullPointerException, ArithmeticException
        Errors: These are not exceptions, but serious issues that typically can’t be recovered from. They are subclasses of java.lang.Error.
                Example: OutOfMemoryError, StackOverflowError

        3. Exception Hierarchy:
        java.lang.Throwable (the root class)
        java.lang.Error
        java.lang.Exception
        java.lang.RuntimeException (Unchecked exceptions)
        Checked exceptions

        4. Exception Handling Mechanism:
        Try Block: Code that might throw an exception is enclosed in a try block.
        Catch Block: Used to catch exceptions that are thrown in the try block. Multiple catch blocks can be used
                to handle different types of exceptions.
        Finally Block: Code inside the finally block is always executed after the try block, regardless of whether an exception
                occurred or not. It is typically used to clean up resources (like closing files or database connections).
        Throw: The throw statement is used to explicitly throw an exception.
        Throws: The throws keyword is used in a method signature to declare exceptions that may be thrown by the method.



         */
    }
}
