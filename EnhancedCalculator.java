// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.Scanner;

public class EnhancedCalculator {
   public EnhancedCalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      int var2;
      do {
         System.out.println("\n=== Enhanced Calculator ===");
         System.out.println("1. Basic Arithmetic");
         System.out.println("2. Scientific Operations");
         System.out.println("3. Unit Conversions");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         var2 = var1.nextInt();
         switch (var2) {
            case 1:
               basicArithmetic(var1);
               break;
            case 2:
               scientificOperations(var1);
               break;
            case 3:
               unitConversions(var1);
               break;
            case 4:
               System.out.println("Thank you for using the calculator!");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      } while(var2 != 4);

      var1.close();
   }

   static void basicArithmetic(Scanner var0) {
      System.out.println("\n--- Basic Arithmetic ---");
      System.out.print("Enter first number: ");
      double var1 = var0.nextDouble();
      System.out.print("Enter second number: ");
      double var3 = var0.nextDouble();
      System.out.println("1. Add (+)");
      System.out.println("2. Subtract (-)");
      System.out.println("3. Multiply (*)");
      System.out.println("4. Divide (/)");
      System.out.print("Choose operation: ");
      int var5 = var0.nextInt();
      switch (var5) {
         case 1:
            System.out.println("Result: " + (var1 + var3));
            break;
         case 2:
            System.out.println("Result: " + (var1 - var3));
            break;
         case 3:
            System.out.println("Result: " + var1 * var3);
            break;
         case 4:
            if (var3 != 0.0) {
               System.out.println("Result: " + var1 / var3);
            } else {
               System.out.println("Error: Cannot divide by zero!");
            }
            break;
         default:
            System.out.println("Invalid operation.");
      }

   }

   static void scientificOperations(Scanner var0) {
      System.out.println("\n--- Scientific Operations ---");
      System.out.println("1. Square Root");
      System.out.println("2. Power (a^b)");
      System.out.print("Choose operation: ");
      int var1 = var0.nextInt();
      switch (var1) {
         case 1:
            System.out.print("Enter number: ");
            double var2 = var0.nextDouble();
            if (var2 >= 0.0) {
               System.out.println("Square Root: " + Math.sqrt(var2));
            } else {
               System.out.println("Error: Negative number!");
            }
            break;
         case 2:
            System.out.print("Enter base: ");
            double var4 = var0.nextDouble();
            System.out.print("Enter exponent: ");
            double var6 = var0.nextDouble();
            PrintStream var10000 = System.out;
            double var10001 = Math.pow(var4, var6);
            var10000.println("Result: " + var10001);
            break;
         default:
            System.out.println("Invalid option.");
      }

   }

   static void unitConversions(Scanner var0) {
      System.out.println("\n--- Unit Conversions ---");
      System.out.println("1. Temperature (Celsius/Fahrenheit)");
      System.out.println("2. Currency (INR/USD)");
      System.out.print("Choose conversion: ");
      int var1 = var0.nextInt();
      switch (var1) {
         case 1:
            temperatureConversion(var0);
            break;
         case 2:
            currencyConversion(var0);
            break;
         default:
            System.out.println("Invalid option.");
      }

   }

   static void temperatureConversion(Scanner var0) {
      System.out.println("1. Celsius to Fahrenheit");
      System.out.println("2. Fahrenheit to Celsius");
      System.out.print("Choose: ");
      int var1 = var0.nextInt();
      double var2;
      double var4;
      if (var1 == 1) {
         System.out.print("Enter Celsius: ");
         var2 = var0.nextDouble();
         var4 = var2 * 9.0 / 5.0 + 32.0;
         System.out.println("Fahrenheit: " + var4);
      } else if (var1 == 2) {
         System.out.print("Enter Fahrenheit: ");
         var2 = var0.nextDouble();
         var4 = (var2 - 32.0) * 5.0 / 9.0;
         System.out.println("Celsius: " + var4);
      } else {
         System.out.println("Invalid choice.");
      }

   }

   static void currencyConversion(Scanner var0) {
      System.out.println("1. INR to USD");
      System.out.println("2. USD to INR");
      System.out.print("Choose: ");
      int var1 = var0.nextInt();
      double var2 = 83.0;
      double var4;
      if (var1 == 1) {
         System.out.print("Enter amount in INR: ");
         var4 = var0.nextDouble();
         System.out.println("USD: " + var4 / var2);
      } else if (var1 == 2) {
         System.out.print("Enter amount in USD: ");
         var4 = var0.nextDouble();
         System.out.println("INR: " + var4 * var2);
      } else {
         System.out.println("Invalid choice.");
      }

   }
}
