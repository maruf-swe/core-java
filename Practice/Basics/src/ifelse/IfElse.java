package ifelse;

public class IfElse {
    public static void main(String[] args) {

        /*
        Syntax of if-else Statement
        if (condition)
        {
        // Executes this block if
        // condition is true
        }
        else
        {
            // Executes this block if
            // condition is false
        }

        Java Conditions and If Statements
        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b
        # Note that if is in lowercase letters

        */

        //# Example of If

        int a = 20, b = 10;
        if (a > b) {
            System.out.println("20 is grater");
        }

        //2nd example of if
        if (100 < 200) {
            System.out.println("200 is grater than 100");
        }

        // example of if else
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // if-else-if ladder with Examples
        int num = 20;
        if (num < 18) {
            System.out.println("Good day.");
        } else if (num > 18) {
            System.out.println("Good evening.");
        } else {
            System.out.println("Good Night");
        }
    }
}