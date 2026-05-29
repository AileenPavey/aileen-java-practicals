// Shared resource
class TicketBooking {
    int seats = 3;

    synchronized void bookTicket(String name, int reqSeats) {
        System.out.println(name + " trying to book " + reqSeats + " seats");

        if (reqSeats <= seats) {
            System.out.println("Booking successful for " + name);
            seats -= reqSeats;
            System.out.println("Seats left: " + seats);
        } else {
            System.out.println("Booking failed for " + name + " (Not enough seats)");
        }
    }
}

// Thread using Runnable
class User implements Runnable {
    TicketBooking t;
    String name;
    int seats;

    User(TicketBooking t, String name, int seats) {
        this.t = t;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        t.bookTicket(name, seats);
    }
}

// Main class
class a20 {
    public static void main(String[] args) {

        TicketBooking t = new TicketBooking();

        Thread t1 = new Thread(new User(t, "User1", 2));
        Thread t2 = new Thread(new User(t, "User2", 2));
        Thread t3 = new Thread(new User(t, "User3", 1));

        t1.start();
        t2.start();
        t3.start();
    }
}