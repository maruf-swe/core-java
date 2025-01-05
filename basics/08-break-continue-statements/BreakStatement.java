package breakcontinuestatement;

public class BreakStatement {
    public static void main(String[] args) {
        /*The break statement is used to immediately exit a loop or switch statement, regardless of the loop's condition.
           Once the break is executed, the program flow continues with the statement immediately following the loop or switch.
        When to Use:
        To exit a loop early when a specific condition is met.
        To exit a switch statement when a certain case has been executed. */

        // Example: Breaking out of a for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;  // Exit the loop when i equals 5
            }
            System.out.println(i);
        }
        System.out.println("Loop ended.");


        // Example: Breaking out of switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;  // Exits the switch after printing Monday
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;  // Exits the switch after printing Wednesday
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
