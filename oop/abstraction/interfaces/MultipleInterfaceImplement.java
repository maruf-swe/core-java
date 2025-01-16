package javaoop.interfaces;

interface A {
    void start();
    void area(int l, int h);
}

interface B {
    void stop();
}

class C implements A, B {
    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void area(int length, int height) {
        System.out.println("Rectangle Area is: "+ length * height);
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }
}

public class MultipleInterfaceImplement {
    public static void main(String[] args) {
        C c1 = new C();
        c1.stop();
        c1.start();
        c1.area(4,5);
    }
}
