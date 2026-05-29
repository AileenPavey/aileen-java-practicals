// Abstract class
abstract class Payment {
    abstract void pay(); // abstract method
}

// Credit Card Payment
class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

// UPI Payment
class UPI extends Payment {
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

// Net Banking Payment
class NetBanking extends Payment {
    void pay() {
        System.out.println("Payment done using Net Banking");
    }
}

// Main class
class a11 {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

        p = new NetBanking();
        p.pay();
    }
}