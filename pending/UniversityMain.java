// Base class
class University {
    String uniName = "SPPU";

    void displayUniversity() {
        System.out.println("University: " + uniName);
    }
}

// Derived class (Single Inheritance)
class Department extends University {
    String deptName = "Computer Science";

    void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}

// Derived class (Multilevel Inheritance)
class Course extends Department {
    String courseName = "BBA(CA)";

    void displayCourse() {
        System.out.println("Course: " + courseName);
    }
}

// Main class
public class UniversityMain{
    public static void main(String[] args) {

        Course c = new Course();

        c.displayUniversity();
        c.displayDepartment();
        c.displayCourse();
    }
}