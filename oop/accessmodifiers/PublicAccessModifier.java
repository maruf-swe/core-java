package javaoop.accessmodifiers;
/*
        Public Access Modifier (public)
      in object-oriented programming (OOP), public is an access modifier that determines the visibility or accessibility of
        class members (methods and variables) from outside the class. When a class member is declared as public, it can be
         accessed directly by any other class or object. It is the least restrictive access level.

Visibility: Public members of a class can be accessed from anywhere in the program—inside the class itself,
   in derived classes, and from outside the class.

Use Case: It is used when you want a class or its members to be freely accessible without any restrictions.

Syntax: The access modifier is declared before the variable, method, or class.

Advantages:
  Ease of Access: Public members allow easy access and modification from any part of the program.
    Good for Utility Methods: It is often used for utility methods or when you need to expose certain functionality globally.

Disadvantages:
 Lack of Control: By making members public, you lose control over how they are accessed or modified, which may lead to
  unintended consequences if improper values are assigned.

 */

public class PublicAccessModifier {
    public static void main(String[] args) {
        PublicAccessCar myCar = new PublicAccessCar();
        myCar.carModel = "BMW 5th Edition";
        myCar.startEngine();
        System.out.println(myCar.carModel);

    }
}
