package javaoop.interfaces;


// Define an interface
interface Payment {
    void makePayment();  // Abstract method
}

// Implementing classes for different payment methods
class CreditCardPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using PayPal");
    }
}

class BankTransferPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using Bank Transfer");
    }
}

// Main class
public class PolymorphismWithImplement2 {
    public static void main(String[] args) {
        // Polymorphism with interfaces
        Payment payment;  // Interface reference

        payment = new CreditCardPayment();
        payment.makePayment();

        payment = new PayPalPayment();
        payment.makePayment();

        payment = new BankTransferPayment();
        payment.makePayment();
    }
}

