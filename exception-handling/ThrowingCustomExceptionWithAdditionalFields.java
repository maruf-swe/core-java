package exceptionhandling;

class InvalidAgeException2 extends Exception {
    final int errorCode;

    public InvalidAgeException2(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

public class ThrowingCustomExceptionWithAdditionalFields {
    public static void main(String[] args) {
        try {
            throw new InvalidAgeException2("Invalid age!", 101);
        } catch (InvalidAgeException2 e) {
            System.out.println(e.getMessage() + " Error code: " + e.getErrorCode());
        }
    }
}



