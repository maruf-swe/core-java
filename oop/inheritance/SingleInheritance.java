package javaoop.inheritance;
/*
In single inheritance, a sub-class is derived from only one super class. It inherits the properties and behavior of a
    single-parent class. Sometimes, it is also known as simple inheritance. In the below figure, ‘A’ is a parent class
     and ‘B’ is a child class. The class ‘B’ inherits all the properties of the class ‘A’.
 */

class Parent1{
    public void parentFunction(){
        System.out.println("Hey their i'm from parent class");
    }
}
class Child1 extends Parent1 {
    public void childFunction(){
        System.out.println(" I am from Child class");
    }


}
public class SingleInheritance {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Parent1 obj2 = new Parent1();
        obj1.childFunction();
        obj2.parentFunction();
        obj1.parentFunction();
    }
}
