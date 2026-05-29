public class Calculator {
    public static void main(String[] args) {

        // Check if correct number of arguments are passed
        if (args.length != 3) {
            System.out.println("please enter <num1> <operator> <num2>");
            return;
        }

        // Convert numbers from String to double
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);
        String op = args[1];

        double result = 0;

        // Perform operation using switch
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.println("Addition = " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Subtraction = " + result);
                break;

            case "x":
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;

            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                }
                break;

            default:
                System.out.println("Invalid");
        }
    }
}