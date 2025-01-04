package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Java Operators
        int a = 10, b = 5;

        // 4. Bitwise Operators
        int c = 4, d = 5; // Binary: c = 0100, d = 0101
        System.out.println("Bitwise AND: " + (c & d));    // &
        System.out.println("Bitwise OR: " + (c | d));     // |
        System.out.println("Bitwise XOR: " + (c ^ d));    // ^
        System.out.println("Bitwise Complement: " + (~c)); // ~
        System.out.println("Left Shift: " + (c << 1));    // <<
        System.out.println("Right Shift: " + (c >> 1));   // >>
        System.out.println("Unsigned Right Shift: " + (c >>> 1)); // >>>

    }
}
