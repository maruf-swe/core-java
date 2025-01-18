package exceptionhandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String messages) {
        super(messages);
    }
}

public class ThrowingCustomException {
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is must 18 or older");
        } else {
            System.out.println("Age is Valid");
        }
    }

}
