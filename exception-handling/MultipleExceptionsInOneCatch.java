package exceptionhandling;

public class MultipleExceptionsInOneCatch {
    public static void main(String[] args) {
        try {
            String str = null;
            int len = str.length();
            int result = 10 / 0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Occured NullPointer exception or Arithmetic exception");
        }
    }
}
