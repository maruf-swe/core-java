package break_continue;

public class Break {
    public static void main(String[] args) {
        //The break statement can also be used to jump out of a loop.
        int a = 10;
        for (int i = 0; i < a; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
