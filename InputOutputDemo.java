import java.util.Scanner;

public class InputOutputDemo { // Class name matches the file name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Integer
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next(); // Clear invalid input
        }
        int integerInput = scanner.nextInt();

        // Input: Decimal
        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a decimal number: ");
            scanner.next();
        }
        double decimalInput = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble()

        // Input: String
        System.out.print("Enter a word or sentence: ");
        String stringInput = scanner.nextLine();

        // Output
        System.out.println("\n--- Output ---");
        System.out.printf("Your integer: %d%n", integerInput);
        System.out.printf("Your decimal number: %.2f%n", decimalInput);
        System.out.printf("Your string: \"%s\"%n", stringInput);

        // Close scanner
        scanner.close();
    }
}
