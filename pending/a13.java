// Base Interface
interface Person {
    String name = "aileen";
    String address = "City";
    int id = 101;
}

// Teacher Interface
interface Teacher extends Person {
    String dept = "Computer";
    double salary = 50000;

    void pay();
}

// Student Interface
interface Student extends Person {
    String major = "IT";
    int credits = 24;
    double gpa = 8.5;

    void study();
}

// Graduate TA implements both
class GraduateTA implements Teacher, Student {

    public void pay() {
        System.out.println("Salary: " + salary);
    }

    public void study() {
        System.out.println("Studying major: " + major);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dept);
        System.out.println("Credits: " + credits);
        System.out.println("GPA: " + gpa);
    }
}

// Main class
class a13 {
    public static void main(String[] args) {

        GraduateTA g = new GraduateTA();

        g.display();
        g.pay();
        g.study();
    }
}