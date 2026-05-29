class Account {
    int accNo;
    String name;
    double balance;

    // Constructor 1
    Account(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
        this.balance = 0;
    }

    // Constructor 2 (Overloaded)
    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {

        // Using different constructors
        Account a1 = new Account(101, "Alice");
        Account a2 = new Account(102, "Bob", 5000);

        a1.display();
        a2.display();
    }
}