/*

        A method is a block of code which only runs when it is called.You can pass data, known as parameters, into a method.
        Methods are used to perform certain actions, and they are also known as functions.Why use methods? To reuse code:
        define the code once, and use it many times.

        Syntax of Method:
        <access_modifier> <return_type> <method_name>( list_of_parameters)
        {
            //body
        }
 */


package function;

public class BasicsFunction {
    //call a method from main class
    static void myMethod() {
        System.out.println("This is the first method call");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod(); //A method can also be called multiple times:
    }
}