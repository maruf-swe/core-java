package strings;


public class BasicString {
    public static void main(String[] args) {
        // Java Strings are used for Storing Text
        /*many of string function available in intellij idea.to use those function you have to write text dot then
        suggestion all function from by default like txt. then you see suggested function*/


        // 1. Creating Strings
        String str1 = "Hello";  // String literal (uses string pool)
        String str2 = "World";  // String literal (uses string pool)

        // Using new keyword
        String str3 = new String("Java");  // Creates a new object in memory

        // 2. String Immutability
        str1 = str1 + " Java";  // This creates a new string object
        System.out.println("Updated str1: " + str1);  // Output: "Hello Java"

        // 3. String Methods
        System.out.println("Length of str1: " + str1.length());  // Output: 10
        System.out.println("Character at index 0 of str1: " + str1.charAt(0));  // Output: H
        System.out.println("Substring of str1 (0, 5): " + str1.substring(0, 5));  // Output: Hello

        // Convert to uppercase and lowercase
        System.out.println("str2 in uppercase: " + str2.toUpperCase());  // Output: WORLD
        System.out.println("str2 in lowercase: " + str2.toLowerCase());  // Output: world

        // Check if str1 contains a specific substring
        System.out.println("Does str1 contain 'Java'? " + str1.contains("Java"));  // Output: true

        // Compare two strings
        System.out.println("str1 equals str2: " + str1.equals(str2));  // Output: false
        System.out.println("str1 equals 'Hello Java': " + str1.equals("Hello Java"));  // Output: true

        // Trim whitespace
        String str4 = "   Java Programming   ";
        System.out.println("Trimmed str4: '" + str4.trim() + "'");  // Output: "Java Programming"

        // Replace characters in a string
        String replacedStr = str4.replace("Programming", "Language");
        System.out.println("Replaced str4: " + replacedStr);  // Output: "Java Language"

        // 4. String Concatenation
        String result = str1 + " " + str2;  // Using + operator
        System.out.println("Concatenated result: " + result);  // Output: "Hello Java World"

        result = str1.concat(" " + str2);  // Using concat() method
        System.out.println("Concatenated result with concat(): " + result);  // Output: "Hello Java World"

        // 5. StringBuilder and StringBuffer Example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("Using StringBuilder: " + sb);  // Output: "Hello World"

        // 6. String Formatting
        int age = 25;
        String formattedString = String.format("Name: %s, Age: %d", str2, age);
        System.out.println("Formatted String: " + formattedString);  // Output: "Name: World, Age: 25"

        // 7. String Pool and Interning
        String str5 = new String("Java");
        String str6 = str5.intern();  // Interning the string
        System.out.println("str3 == str5: " + (str3 == str5));  // Output: false
        System.out.println("str3 == str6: " + (str3 == str6));  // Output: true
    }
}

