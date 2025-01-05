package breakcontinuestatement;

public class ContinueStatement {
    public static void main(String[] args) {
        /*
        The continue statement is used to skip the current iteration of a loop and move to the next iteration of the
           loop. Unlike break, it does not exit the loop; it simply skips the remaining code inside the loop body for
              the current iteration and continues with the next loop iteration.

        When to Use:
        To skip specific iterations in a loop based on a condition, without breaking the entire loop.*/

        //Example: Skipping even numbers in a for loop
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip the current iteration if i is even
            }
            System.out.println(i);
        }
    }
}
