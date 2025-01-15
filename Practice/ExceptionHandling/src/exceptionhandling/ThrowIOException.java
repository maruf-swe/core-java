package exceptionhandling;

import java.io.IOException;

public class ThrowIOException {
    public static void main(String[] args) {
        /*
        What is an IOException?
        IOException is a checked exception in Java.
        It typically occurs during input/output operations, such as
            reading from a file, writing to a file, or communicating over a network.
        */
        try {
            performOperation();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void performOperation() throws IOException {
        // Simulate an error
        throw new IOException("Something went wrong during I/O operation.");
    }
}



