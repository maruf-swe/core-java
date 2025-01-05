package variables;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        Java Type Casting:
        Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:
        1. Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        2. Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
        */
        //Widening Casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);
        //Narrowing Casting must be done manually by placing the type in parentheses in front of the value:

        double myDoubleNumber = 9.78d;
        int myInteger = (int) myDoubleNumber;
        System.out.println(myInteger);

    }

}