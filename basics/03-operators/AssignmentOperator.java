package operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        // Java Operators
        int a = 10, b = 5;


        // 5. Assignment Operators
        int e = 10;
        e += 5; // e = e + 5
        System.out.println("Add and assign: " + e);       // +=
        e -= 3; // e = e - 3
        System.out.println("Subtract and assign: " + e); // -=
        e *= 2; // e = e * 2
        System.out.println("Multiply and assign: " + e); // *=
        e /= 2; // e = e / 2
        System.out.println("Divide and assign: " + e);   // /=
        e %= 3; // e = e % 3
        System.out.println("Modulus and assign: " + e);  // %=

    }
}
