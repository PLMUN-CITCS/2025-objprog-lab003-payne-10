import java.util.Scanner;

public class InputOutputFormatting {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input: Integer, Decimal, and String
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();
        
        System.out.print("Enter a decimal number: ");
        double decimalInput = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        
        System.out.print("Enter a word or sentence: ");
        String stringInput = scanner.nextLine();
        
        // Output: Using printf for formatted output
        System.out.println("Your integer: " + integerInput);
        System.out.printf("Your decimal number: %.2f%n", decimalInput);
        System.out.println("Your string: " + stringInput);
        
        // Close the scanner
        scanner.close();
    }
}
