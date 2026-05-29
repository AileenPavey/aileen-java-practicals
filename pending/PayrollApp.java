// Base class
class Employee {
    double salary;

    void calculateSalary() {
        System.out.println("Calculating salary");
    }
}

// Permanent Employee
class Permanent extends Employee {
    void calculateSalary() {
        salary = 50000 + 5000; // basic + bonus
        System.out.println("Permanent Employee Salary: " + salary);
    }
}

// Contract Employee
class Contract extends Employee {
    void calculateSalary() {
        salary = 30000; // fixed
        System.out.println("Contract Employee Salary: " + salary);
    }
}

// Intern
class Intern extends Employee {
    void calculateSalary() {
        salary = 10000; // stipend
        System.out.println("Intern Salary: " + salary);
    }
}

// Main class
public class PayrollApp {
    public static void main(String[] args) {

        Employee e;

        // Runtime Polymorphism
        e = new Permanent();
        e.calculateSalary();

        e = new Contract();
        e.calculateSalary();

        e = new Intern();
        e.calculateSalary();
    }
}