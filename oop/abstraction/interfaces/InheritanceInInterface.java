package javaoop.interfaces;

// Parent interface
interface ParentInterface {
    void action1();
}

// Child interface
interface ChildInterface extends ParentInterface {
    void action2();
}

// Implementing class
class ImplementationClass implements ChildInterface {
    @Override
    public void action1() {
        System.out.println("ImplementationClass performs action1");
    }

    @Override
    public void action2() {
        System.out.println("ImplementationClass performs action2");
    }
}

public class InheritanceInInterface {
    public static void main(String[] args) {
        ChildInterface obj = new ImplementationClass();
        obj.action1();
        obj.action2();
    }
}
