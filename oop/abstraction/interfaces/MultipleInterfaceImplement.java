package javaoop.interfaces;

interface A {
    void start();
}

interface B {
    void stop();
}

class c implements A, B {
    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }
}

public class MultipleInterfaceImplement {
    public static void main(String[] args) {

    }
}
