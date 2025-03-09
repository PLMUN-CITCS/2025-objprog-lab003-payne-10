import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next(); // Clear the invalid input
        }
        int integerInput = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character left by nextInt()

        // Read decimal number input
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a decimal number: ");
            scanner.next(); // Clear the invalid input
        }
        double decimalInput = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline character left by nextDouble()

        // Read string input
        System.out.print("Enter a word or sentence: ");
        String stringInput = scanner.nextLine();

        // Output the results
        System.out.println("\n--- Output ---");
        System.out.printf("Your integer: %d%n", integerInput);
        System.out.printf("Your decimal number: %.2f%n", decimalInput);
        System.out.printf("Your string: %s%n", stringInput);

        scanner.close();
    }
}
