package javaoop.inheritance;

class Parent {
    private String name = "Parent Name";
    private String name2 = "Maruf";

    // Getter for the private variable
    public String getName() { //private variable access by getter method
        return name;
    }
    public void getName2() {
        System.out.println(name2);
    }
}

class Child extends Parent {
    public void printName() {
        System.out.println("Accessing Parent Variable: " + getName());
    }
}

class PrivateVariableAccessInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printName(); // Output: Accessing Parent Variable for private
        obj.getName2(); // accessing parent variable directly for public method
    }
}