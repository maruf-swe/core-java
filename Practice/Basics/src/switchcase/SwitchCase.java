package switchcase;

/*
This is how it works:
The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described later in this chapter
When Java reaches a break keyword, it breaks out of the switch block.
The default keyword specifies some code to run if there is no case match:
*/
public class SwitchCase {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("Matching in case 1");
                break;
            case 2:
                System.out.println("Matching in case 2");
                break;
            case 3:
                System.out.println("Matching in case 3");
                break;
            default:
                System.out.println("No matching");

        }
    }
}
