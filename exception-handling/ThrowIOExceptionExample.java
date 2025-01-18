package exceptionhandling;

import java.io.IOException;

public class ThrowIOExceptionExample {
    public void readFile(String filePath) throws IOException {
        if (filePath == null || filePath.isEmpty()) {
            throw new IOException("File path cannot be null or empty.");
        }

        // Add file reading logic here (e.g., using BufferedReader)
        System.out.println("Reading file: " + filePath);
    }

    public static void main(String[] args) {
        ThrowIOExceptionExample handler = new ThrowIOExceptionExample();
        try {
            handler.readFile(""); // Simulate an error
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

