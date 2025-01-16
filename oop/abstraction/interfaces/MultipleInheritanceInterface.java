package javaoop.interfaces;

interface Payable {
    void pay();
}

interface Notifiable {
    void notifyUser();
}

// Child interface inheriting from multiple interfaces
interface Transaction extends Payable, Notifiable {
    void record();
}

// Implementing class
class PaymentProcessor implements Transaction {
    @Override
    public void pay() {
        System.out.println("Processing payment");
    }

    @Override
    public void notifyUser() {
        System.out.println("Notifying user");
    }

    @Override
    public void record() {
        System.out.println("Recording transaction");
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        PaymentProcessor pp = new PaymentProcessor();
        pp.pay();
        pp.notifyUser();
        pp.record();
    }
}
