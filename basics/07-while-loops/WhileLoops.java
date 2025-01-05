package whileloops;

public class WhileLoops {
    public static void main(String[] args) {
        /*
        The while loop loops through a block of code as long as a specified condition is true:
        #Syntax
        while (condition) {
            // code block to be executed
        }
        */

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int num = 10;
        int num2 = 1;
        while (num > num2) {
            System.out.println(num2);
            num2++;
        }

    }
}