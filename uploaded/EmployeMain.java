class Employee {
    public int id;
    public String name;

    // Private attributes (controlled access)
    private double salary;
    private String designation;
    private String department;

    // Setter methods
    public void setDetails(double salary, String designation, String department) {
        this.salary = salary;
        this.designation = designation;
        this.department = department;
    }

    // Getter methods
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

// Main class
public class EmployeMain {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Alice";
        e1.setDetails(50000, "Manager", "HR");

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Bob";
        e2.setDetails(30000, "Developer", "IT");

        e1.display();
        e2.display();
    }
}