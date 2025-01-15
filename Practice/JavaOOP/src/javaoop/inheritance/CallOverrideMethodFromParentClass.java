package javaoop.inheritance;

class BaseClass {
    public void greet() {
        System.out.println("Hello from Parent!");
    }
}

class subClass extends BaseClass {
    @Override
    public void greet() {
        System.out.println("Hello from Child!");
    }

    public void callParentGreet() {
        super.greet(); // Calls the Parent's greet method
    }
}

class CallOverrideMethodFromParentClass {
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.greet();          // Output: Hello from Child!
        obj.callParentGreet(); // Output: Hello from Parent!
    }
}
