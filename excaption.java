import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator, denominator;
        int result = 0;

        try {
            System.out.print("Enter numerator: ");
            numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            denominator = sc.nextInt();

            result = numerator / denominator; // May throw ArithmeticException

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program executed successfully.");
            sc.close();
        }
    }
}
