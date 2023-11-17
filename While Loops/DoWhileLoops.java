package while_loops;

public class DoWhileLoops {
    public static void main(String[] args) {
        /*
        The loop will always be executed at least once, even if the condition is false,
        because the code block is executed before the condition is tested:

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
