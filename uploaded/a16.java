import java.util.Scanner;

// Custom Exception 1
class LowAttendanceException extends Exception {
    LowAttendanceException(String msg) {
        super(msg);
    }
}

// Custom Exception 2
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 5000;

        try {
            // Attendance check
            System.out.print("Attendance %: ");
            int att = sc.nextInt();

            if (att < 75)
                throw new LowAttendanceException("Not eligible (Attendance < 75%)");

            System.out.println("Eligible for exam");

            // Withdrawal check
            System.out.print("Withdraw amount: ");
            double amt = sc.nextDouble();

            if (amt > balance)
                throw new InsufficientBalanceException("Insufficient balance");

            System.out.println("Withdrawal successful");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}// import java.util.*;

// // Custom Exception 1
// class LowAttendanceException extends Exception {
//     LowAttendanceException(String msg) {
//         super(msg);
//     }
// }

// // Custom Exception 2
// class InsufficientBalanceException extends Exception {
//     InsufficientBalanceException(String msg) {
//         super(msg);
//     }
// }

// class a16 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         try {
//             // Attendance Check
//             System.out.print("Enter attendance %: ");
//             int attendance = sc.nextInt();

//             if (attendance < 75) {
//                 throw new LowAttendanceException("Attendance below 75% - Not Eligible");
//             } else {
//                 System.out.println("Eligible for exam");
//             }

//             // Bank Withdrawal Check
//             double balance = 5000;
//             System.out.print("Enter withdrawal amount: ");
//             double amount = sc.nextDouble();

//             if (amount > balance) {
//                 throw new InsufficientBalanceException("Insufficient Balance!");
//             } else {
//                 System.out.println("Withdrawal Successful");
//             }

//         } catch (LowAttendanceException e) {
//             System.out.println(e.getMessage());

//         } catch (InsufficientBalanceException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }