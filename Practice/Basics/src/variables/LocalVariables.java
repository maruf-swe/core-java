package variables;

public class LocalVariables {
    public static void main(String[] args) {
        /*
          Local Variables:
         A variable defined within a block or method or constructor is called a local variable

         The Local variable is created at the time of declaration and destroyed after exiting from the block or when
                      the call returns from the function.
        The scope of these variables exists only within the block in which the variables are declared, i.e.,
           we can access these variables only within that block.
        Initialization of the local variable is mandatory before using it in the defined scope.
        */

        // x is a local variable
        int x = 10;

        // message is also a local
        // variable
        String message = "Hello, world!";

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if (x > 5) {
            // result is a
            // local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }

        // Uncommenting the line below will result in a
        // compile-time error System.out.println(result);

        for (int i = 0; i < 3; i++) {
            String loopMessage
                    = "Iteration "
                    + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }

        // Uncommenting the line below will result in a
        // compile-time error
        // System.out.println(loopMessage);
    }
}

