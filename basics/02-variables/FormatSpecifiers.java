package variables;

/*
A format specifier is a special sequence of characters used in programming (including Java) to define the format of data when
     printing it to the console or formatting strings. It specifies how a value (variable or literal) should be displayed,
        including its type, precision, width, alignment, and other properties.

Format specifiers are primarily used in methods like System.out.printf(), System.out.format(), and String.format().
 */
public class FormatSpecifiers {
    public static void main(String[] args) {

        // Using System.out.printf()
        // Purpose: Used specifically for formatted output.
        int intValue = 10;
        float floatValue = 5.25f;
        double doubleValue = 123.456;

        // Print an integer
        System.out.printf("Integer: %d%n", intValue); // %using for new line. like \n

        // Print a float with 2 decimal places
        System.out.printf("Float: %.2f%n", floatValue);

        // Print a double with 4 decimal places
        System.out.printf("Double: %.4f%n", doubleValue);
        System.out.printf("Double: %.2f%n", doubleValue);

        // Combine multiple values
        System.out.printf("Values: %d, %.2f, %.4f%n", intValue, floatValue, doubleValue);



        // Using System.out.println()
        // purpose:  Primarily used for simple, unformatted output. Automatically adds a newline after printing
        // Behavior: Does not support format specifiers directly. You can achieve formatting by combining it with String.format().
        // System.out.println(String.format(format, arguments));

        int intValue2 = 20;
        double doubleValue2 = 1234.567844;

        // Without format specifiers
        System.out.println("Integer: " + intValue2);  // Output: Integer: 20

        // Using String.format for formatted output
        System.out.println(String.format("Double: %.2f%n", doubleValue2));

        int intValue4 = 100;
        float floatValue4 = 5.25f;
        double doubleValue4 = 123.456;

       // Using String.format to combine multiple values
        System.out.println(String.format("Integer: %d, Float: %.2f, Double: %.3f", intValue4, floatValue4, doubleValue4));




        //Using System.out.print()
        // Purpose: Prints text to the console without adding a newline after it.
        // Behavior: Like System.out.println(), it does not directly support format specifiers,
           //  but you can combine it with String.format() for formatted output.

        int intValue3 = 30;
        float floatValue3 = 4.567f;
        double double3 = 5.346775433;

        // Without format specifiers
        System.out.print("Integer: " + intValue3);

        // Using String.format for formatted output
        System.out.print(String.format(" Float: %.2f", floatValue3));
        System.out.print(String.format(" Double: %.3f", double3));



    }
}
