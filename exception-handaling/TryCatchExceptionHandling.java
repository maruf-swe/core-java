package basic;

import java.util.Scanner;

public class TryCatchExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a Number which is divided: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter a Number which is divided by: ");
            int number2 = scanner.nextInt();
            int x = number1 / number2;
            System.out.println("The Result is: " + x);
        } catch (ArithmeticException e) {
            System.out.println("You can't divided by Zero");
        }
    }

}
