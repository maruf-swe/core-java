package forloops;
/*
Java For Loop:
    When you know exactly how many times you want to loop through a block of code,
        use the for loop instead of a while loop.

    Syntax:
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }

        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed.
 */

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

    }
}