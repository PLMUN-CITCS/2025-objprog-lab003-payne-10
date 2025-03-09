public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        int integerInput = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a decimal number: ");
            scanner.next();
        }
        double decimalInput = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter your name: ");
        String nameInput = scanner.nextLine();

        System.out.print("Enter a word or sentence: ");
        String stringInput = scanner.nextLine();

        System.out.println("\n--- Output ---");
        System.out.printf("Your integer: %d%n", integerInput);
        System.out.printf("Your decimal number: %.2f%n", decimalInput);
        System.out.printf("Your name: %s%n", nameInput);
        System.out.printf("Your string: \"%s\"%n", stringInput);

        scanner.close();
    }
}