package break_continue;

public class Continue {
    public static void main(String[] args) {
        //The continue statement breaks one iteration (in the loop),
        // if a specified condition occurs, and continues with the next iteration in the loop.
        int a = 10;
        for (int i = 0; i < a; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
