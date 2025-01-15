package introduction;

/*A package in Java is used to group related classes.
Think of it as a folder in a file directory*/

public class JavaSyntax {
    /*
     Every line of code that runs in Java must be inside a class.
     In our example, we named the class JavaSyntax.
     A class should always start with an uppercase first letter.(lowercase is allowed but discouraged).
     Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.
     */
    public static void main(String[] args) {
        /*
        # public -it's the access specifier means from every where we can access it.
        # static -access modifier means we can call this method directly using a class name without creating an object of it.
        # void - it's the return type. void doesn't return anything.
        # main - The Java main method is usually the first method  its the entry point for executing a Java program.
        # string [] args - it accepts only string type of argument.
        */
        System.out.println("Hello Maruf");
    }
}