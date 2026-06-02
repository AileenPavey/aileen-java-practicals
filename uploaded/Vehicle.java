import java.util.Scanner;

// Base class
class Vehicles {
    String name;

    void getData(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Vehicle Name: " + name);
    }
}

// Derived class - Automobiles
class Automobiles extends Vehicles {
    String type = "Motor Driven";

    void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}

// Derived class - Pulled Vehicles
class PulledVehicles extends Vehicles {
    String type = "Pulled Vehicles";

    void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}

// Car
class Car extends Automobiles {
    void display() {
        super.display();
        System.out.println("Category: Car\n");
    }
}

// Bus
class Bus extends Automobiles {
    void display() {
        super.display();
        System.out.println("Category: Bus\n");
    }
}

// Cart
class Cart extends PulledVehicles {
    void display() {
        super.display();
        System.out.println("Category: Cart\n");
    }
}

// Rikshaw
class Rikshaw extends PulledVehicles {
    void display() {
        super.display();
        System.out.println("Category: Rikshaw\n");
    }
}

// Main class
public class Vehicle {
    public static void main(String[] args) {

        Car c = new Car();
        c.getData("Car");
        c.display();

        Bus b = new Bus();
        b.getData("Bus");
        b.display();

        Cart ct = new Cart();
        ct.getData("Cart");
        ct.display();

        Rikshaw r = new Rikshaw();
        r.getData("Rikshaw");
        r.display();
    }
}