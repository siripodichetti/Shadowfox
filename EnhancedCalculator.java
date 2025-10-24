import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mainChoice;

        System.out.println("====================================");
        System.out.println("     🧮 Welcome to ShadowFox Calculator");
        System.out.println("====================================");

        do {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1 Basic Arithmetic");
            System.out.println("2  Scientific Operations");
            System.out.println("3  Unit Conversions");
            System.out.println("4  Exit ");
            System.out.print("Enter your choice: ");
            mainChoice = input.nextInt();

            switch (mainChoice) {
                case 1:
                    basicArithmetic(input);
                    break;
                case 2:
                    scientificOperations(input);
                    break;
                case 3:
                    unitConversions(input);
                    break;
                case 4:
                    System.out.println("✅ Thank you for using the ShadowFox Calculator!");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        } while (mainChoice != 4);

        input.close();
    }

    // ---------- BASIC ARITHMETIC ----------
    static void basicArithmetic(Scanner input) {
        System.out.println("\n--- Basic Arithmetic ---");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("1. + Add");
        System.out.println("2. - Subtract");
        System.out.println("3. * Multiply");
        System.out.println("4. % Divide");
        System.out.print("Choose operation: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("⚠️ Error: Cannot divide by zero!");
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    // ---------- SCIENTIFIC OPERATIONS ----------
    static void scientificOperations(Scanner input) {
        System.out.println("\n--- Scientific Operations ---");
        System.out.println("1. √ Square Root");
        System.out.println("2. ^ Power (a^b)");
        System.out.print("Choose operation: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                double num = input.nextDouble();
                if (num >= 0)
                    System.out.println("Square Root: " + Math.sqrt(num));
                else
                    System.out.println("⚠️ Error: Negative number!");
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter exponent: ");
                double exp = input.nextDouble();
                System.out.println("Result: " + Math.pow(base, exp));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // ---------- UNIT CONVERSIONS ----------
    static void unitConversions(Scanner input) {
        System.out.println("\n--- Unit Conversions ---");
        System.out.println("1. 🌡 Temperature (Celsius/Fahrenheit)");
        System.out.println("2. 💰 Currency (INR/USD)");
        System.out.print("Choose conversion: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                temperatureConversion(input);
                break;
            case 2:
                currencyConversion(input);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // Temperature conversion
    static void temperatureConversion(Scanner input) {
        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        System.out.print("Choose: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = input.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + f);
        } else if (choice == 2) {
            System.out.print("Enter Fahrenheit: ");
            double f = input.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Currency conversion
    static void currencyConversion(Scanner input) {
        System.out.println("1. INR → USD");
        System.out.println("2. USD → INR");
        System.out.print("Choose: ");
        int choice = input.nextInt();

        double rate = 83.0; // Example conversion rate

        if (choice == 1) {
            System.out.print("Enter amount in INR: ");
            double inr = input.nextDouble();
            System.out.println("USD: " + (inr / rate));
        } else if (choice == 2) {
            System.out.print("Enter amount in USD: ");
            double usd = input.nextDouble();
            System.out.println("INR: " + (usd * rate));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

