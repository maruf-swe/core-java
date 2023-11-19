package function;

public class MethodParameter {
    //single parameter function
    static void namePrint(String name) {
        System.out.println(name);
    }

    //double parameter function
    static void sumTwoNumber(int num1, int num2) { // a and b is parameter
        System.out.println(num1 + num2);
    }

    //return type function
    static int twoNumberSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        namePrint("Maruf");
        sumTwoNumber(10, 20); // 10 and 20 is Arguments
        System.out.println(twoNumberSum(20, 30));

    }
}
