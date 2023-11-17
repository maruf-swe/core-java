package while_loops;

public class DoWhileLoops {
    public static void main(String[] args) {
        /*
        The do/while loop is a variant of the while loop. This loop will execute the code block once,
        before checking if the condition is true, then it will repeat the loop as long as the condition is true.

        # Syntax
        do {
            // code block to be executed
        }
        while (condition);
         */

        int i = 10;
        do {
            System.out.println(i);
            i--;
        }
        while (i > 2);

        int num = 10;
        do {
            System.out.println(num);
            num--;
        }
        while (num > 2);
    }
}
