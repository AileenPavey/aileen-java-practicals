public class StudentMarks {
    public static void main(String[] args) {

        // 1D Array → total marks
        int marks[] = {250, 300, 280};

        int sum = 0;

        // calculate sum
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        // calculate average
        double avg = sum / marks.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        // 2D Arrays
        int a[][] = {
            {80, 70, 90},
            {85, 75, 95},
            {78, 88, 92}
        };

        int b[][] = {
            {70, 60, 80},
            {75, 65, 85},
            {68, 78, 82}
        };

        // Matrix Addition
        System.out.println("\nMatrix Addition:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}// public class StudentMarks {
//     public static void main(String[] args) {

//         // 1D Array (Total marks of students)
//         int totalMarks[] = {250, 300, 280};

//         int sum = 0;
//         for (int i = 0; i < totalMarks.length; i++) {
//             sum += totalMarks[i];
//         }

//         double avg = (double) sum / totalMarks.length;

//         System.out.println("Sum = " + sum);
//         System.out.println("Average = " + avg);

//         // 2D Array (Marks of 3 students in 3 subjects)
//         int marks1[][] = {
//             {80, 70, 90},
//             {85, 75, 95},
//             {78, 88, 92}
//         };

//         int marks2[][] = {
//             {70, 60, 80},
//             {75, 65, 85},
//             {68, 78, 82}
//         };

//         int result[][] = new int[3][3];

//         // Matrix Addition
//         System.out.println("\nMatrix Addition:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 result[i][j] = marks1[i][j] + marks2[i][j];
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }