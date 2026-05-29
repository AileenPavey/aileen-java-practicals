import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        try {
            System.out.print("Enter amount: ");
            // InputMismatchException is thrown automatically by Scanner
            int amt = sc.nextInt();

            if (amt < 0)
                throw new IllegalArgumentException();

            if (amt > balance)
                throw new ArithmeticException();

            balance -= amt;
            System.out.println("Success!"+amt+"withdrawn remaining balance "+balance);

        } catch (InputMismatchException e) {
            System.out.println("Enter only numbers");

        } catch (IllegalArgumentException e) {
            System.out.println("Negative not allowed");

        } catch (ArithmeticException e) {
            System.out.println("Insufficient balance");
        }

        sc.close();
    }
}// import java.util.*;

// class a15 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         double balance = 5000;

//         try {
//             System.out.print("Enter amount: ");
//             double amount = sc.nextDouble(); // InputMismatchException

//             if (amount < 0) {
//                 throw new IllegalArgumentException("Negative amount not allowed");
//             }

//             if (amount == 0) {
//                 int x = 10 / 0; // ArithmeticException
//             }

//             if (amount > balance) {
//                 System.out.println("Insufficient balance");
//             } else {
//                 balance = balance - amount;
//                 System.out.println("Withdrawn: " + amount);
//                 System.out.println("Remaining balance: " + balance);
//             }

//         } catch (InputMismatchException e) {
//             System.out.println("Enter numeric value only");

//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());

//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic error occurred");
//         }
//     }
// }