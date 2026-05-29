import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, marks;
        String result, grade, remarks;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Enter marks (0-100): ");
            marks = sc.nextInt();

            // Pass or Fail using if-else
            if (marks >= 40) {
                result = "PASS";
            } else {
                result = "FAIL";
            }

            // Grade classification using if-else
            if (marks >= 75) {
                grade = "A";
            } else if (marks >= 60) {
                grade = "B";
            } else if (marks >= 50) {
                grade = "C";
            } else if (marks >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Remarks using switch
            switch (grade) {
                case "A":
                    remarks = "Excellent Performance";
                    break;
                case "B":
                    remarks = "Very Good";
                    break;
                case "C":
                    remarks = "Good";
                    break;
                case "D":
                    remarks = "Needs Improvement";
                    break;
                default:
                    remarks = "Failed - Work Hard";
            }

            // Display result
            System.out.println("Marks: " + marks);
            System.out.println("Result: " + result);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }

        sc.close();
    }
}