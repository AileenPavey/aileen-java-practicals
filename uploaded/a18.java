import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        String data = name + " " + marks;

        // WRITE to file
        FileWriter fw = new FileWriter("student.txt");
        fw.write(data);
        fw.close();

        // READ from file
        System.out.println("\nReading from file:");
        FileReader fr = new FileReader("student.txt");

        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

        fr.close();
        sc.close();
    }
}// import java.io.*;
// import java.util.*;

// class a18 {
//     public static void main(String[] args) throws Exception {

//         Scanner sc = new Scanner(System.in);

//         // Take input
//         System.out.print("Enter Name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter Marks: ");
//         int marks = sc.nextInt();

//         // 🔹 Write to file
//         FileWriter fw = new FileWriter("student.txt");
//         fw.write("Name: " + name + "\nMarks: " + marks);
//         fw.close();

//         // 🔹 Read from file
//         FileReader fr = new FileReader("student.txt");
//         int i;

//         System.out.println("\nReading from file:");
//         while ((i = fr.read()) != -1) {
//             System.out.print((char) i);
//         }

//         fr.close();
//         sc.close();
//     }
// }
