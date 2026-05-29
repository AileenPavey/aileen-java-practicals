import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Marks: ");
        int marks = sc.nextInt();

        String data = name + " " + marks;

        // BYTE STREAM WRITE
        FileOutputStream fos = new FileOutputStream("byte.txt");
        fos.write(data.getBytes());
        fos.close();

        // BYTE STREAM READ
        System.out.println("\nByte File:");
        FileInputStream fis = new FileInputStream("byte.txt");
        int i;
        while ((i = fis.read()) != -1)
            System.out.print((char) i);
        fis.close();

        // CHARACTER STREAM WRITE
        FileWriter fw = new FileWriter("char.txt");
        fw.write(data);
        fw.close();

        // CHARACTER STREAM READ
        System.out.println("\n\nChar File:");
        FileReader fr = new FileReader("char.txt");
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        fr.close();

        sc.close();
    }
}// import java.io.*;
// import java.util.*;

// class a17 {
//     public static void main(String[] args) throws Exception {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter Marks: ");
//         int marks = sc.nextInt();

//         String data = name + " " + marks;

//         // 🔹 BYTE STREAM (Write)
//         FileOutputStream fos = new FileOutputStream("student_byte.txt");
//         fos.write(data.getBytes());
//         fos.close();

//         // 🔹 BYTE STREAM (Read)
//         FileInputStream fis = new FileInputStream("student_byte.txt");
//         int i;
//         System.out.println("\nReading from byte file:");
//         while ((i = fis.read()) != -1) {
//             System.out.print((char) i);
//         }
//         fis.close();

//         // 🔹 CHARACTER STREAM (Write)
//         FileWriter fw = new FileWriter("student_char.txt");
//         fw.write(data);
//         fw.close();

//         // 🔹 CHARACTER STREAM (Read)
//         FileReader fr = new FileReader("student_char.txt");
//         System.out.println("\n\nReading from character file:");
//         while ((i = fr.read()) != -1) {
//             System.out.print((char) i);
//         }
//         fr.close();

//         sc.close();
//     }
// }