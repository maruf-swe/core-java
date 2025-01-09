package exceptionhandling;

public class BasicSyntaxOfExceptionHandling {
    public static void main(String[] args) {
        /*
        Here's the core syntax for exception handling in Java:

        Syntax Overview:
        try {
            // Code that may throw an exception
        } catch (ExceptionType e) {
            // Code to handle the exception
        } finally {
            // Code that will always execute (optional)
        }

         Throwing Exceptions:

        public void myMethod() throws IOException {
            if (somethingWentWrong) {
                throw new IOException("File not found!");

         Common Built-in Exceptions:
            NullPointerException: Occurs when you attempt to access or modify an object reference that is null.
            ArrayIndexOutOfBoundsException: Happens when you try to access an invalid index in an array.
            ArithmeticException: Thrown when there is an arithmetic error, like division by zero.
            ClassNotFoundException: Raised when the JVM cannot find the class you’re trying to load.
            FileNotFoundException: Occurs when attempting to open a file that doesn't exist.

*/
    }
}
