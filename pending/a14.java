// Base Class
class Asset {
    int id;
    String type;

    Asset(int id, String type) {
        this.id = id;
        this.type = type;
    }

    void print() {
        System.out.println(id + " " + type);
    }
}

// BankAccount
class BankAccount extends Asset {
    String bankName;
    float balance;

    BankAccount(int id, String type, String bankName, float balance) {
        super(id, type);
        this.bankName = bankName;
        this.balance = balance;
    }

    void print() {
        super.print();
        System.out.println(bankName + " " + balance);
    }
}

// SavingAccount
class SavingAccount extends BankAccount {
    float interestRate;

    SavingAccount(int id, String type, String bankName, float balance, float interestRate) {
        super(id, type, bankName, balance);
        this.interestRate = interestRate;
    }

    void print() {
        super.print();
        System.out.println(interestRate);
    }
}

// CheckingAccount
class CheckingAccount extends BankAccount {
    float overdraftLimit;

    CheckingAccount(int id, String type, String bankName, float balance, float overdraftLimit) {
        super(id, type, bankName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void print() {
        super.print();
        System.out.println(overdraftLimit);
    }
}

// Security
class Security extends Asset {
    String exchange;

    Security(int id, String type, String exchange) {
        super(id, type);
        this.exchange = exchange;
    }

    void print() {
        super.print();
        System.out.println(exchange);
    }
}

// RealEstate
class RealEstate extends Asset {
    float area;

    RealEstate(int id, String type, float area) {
        super(id, type);
        this.area = area;
    }

    void print() {
        super.print();
        System.out.println(area);
    }
}

// Main Class
class Main {
    public static void main(String[] args) {

        new SavingAccount(1, "Saving", "SBI", 5000, 4.5f).print();
        new CheckingAccount(2, "Checking", "HDFC", 8000, 2000).print();
        new Security(3, "Security", "NSE").print();
        new RealEstate(4, "Property", 1200).print();
    }
}
// // Base Class
// class Asset {
//     int id;
//     String type;

//     Asset(int id, String type) {
//         this.id = id;
//         this.type = type;
//     }

//     void printDescription() {
//         System.out.println("ID: " + id);
//         System.out.println("Type: " + type);
//     }
// }

// // BankAccount Class
// class BankAccount extends Asset {
//     String bankName;
//     float balance;

//     BankAccount(int id, String type, String bankName, float balance) {
//         super(id, type);
//         this.bankName = bankName;
//         this.balance = balance;
//     }

//     void showAccount() {
//         printDescription();
//         System.out.println("Bank Name: " + bankName);
//         System.out.println("Balance: " + balance);
//     }
// }

// // Saving Account
// class SavingAccount extends BankAccount {
//     float interestRate;

//     SavingAccount(int id, String type, String bankName, float balance, float interestRate) {
//         super(id, type, bankName, balance);
//         this.interestRate = interestRate;
//     }

//     void display() {
//         showAccount();
//         System.out.println("Interest Rate: " + interestRate);
//     }
// }

// // Checking Account
// class CheckingAccount extends BankAccount {
//     float overdraftLimit;

//     CheckingAccount(int id, String type, String bankName, float balance, float overdraftLimit) {
//         super(id, type, bankName, balance);
//         this.overdraftLimit = overdraftLimit;
//     }

//     void display() {
//         showAccount();
//         System.out.println("Overdraft Limit: " + overdraftLimit);
//     }
// }

// // Security Class
// class Security extends Asset {
//     String tradeExchangeName;

//     Security(int id, String type, String tradeExchangeName) {
//         super(id, type);
//         this.tradeExchangeName = tradeExchangeName;
//     }

//     void display() {
//         printDescription();
//         System.out.println("Exchange: " + tradeExchangeName);
//     }
// }

// // RealEstate Class
// class RealEstate extends Asset {
//     float buildUpArea;

//     RealEstate(int id, String type, float buildUpArea) {
//         super(id, type);
//         this.buildUpArea = buildUpArea;
//     }

//     void display() {
//         printDescription();
//         System.out.println("Build Area: " + buildUpArea);
//     }
// }

// // Main Class
// class a14 {
//     public static void main(String[] args) {

//         SavingAccount s = new SavingAccount(1, "Saving", "SBI", 5000, 4.5f);
//         CheckingAccount c = new CheckingAccount(2, "Checking", "HDFC", 8000, 2000);
//         Security sec = new Security(3, "Security", "NSE");
//         RealEstate r = new RealEstate(4, "Property", 1200);

//         System.out.println("---- Saving Account ----");
//         s.display();

//         System.out.println("\n---- Checking Account ----");
//         c.display();

//         System.out.println("\n---- Security ----");
//         sec.display();

//         System.out.println("\n---- Real Estate ----");
//         r.display();
//     }
// }