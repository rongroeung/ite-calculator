import java.util.Scanner;

/**
 * Author: Theng Rathrongroeung
 * This is the main class to demonstrate the functionality of Arithmetic, Trigonometry and Bitwise.
 */

public class ITECalculator {

    /**
     * Displays a main menu and submenus for various operations.
     * Allows the user to choose and perform specific operations.
     */
    public static void createMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Arithmetic Operators");
            System.out.println("2. Trigonometric Operators");
            System.out.println("3. Bitwise Operators");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> arithmeticMenu();
                case 2 -> trigonometricMenu();
                case 3 -> bitwiseMenu();
                case 0 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays a submenu for arithmetic operations.
     * Allows the user to perform basic arithmetic operations.
     */
    private static void arithmeticMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("1. Sum");
        System.out.println("2. Minus");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulo");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Result: " + (num1 + num2));
            case 2 -> System.out.println("Result: " + (num1 - num2));
            case 3 -> System.out.println("Result: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            }
            case 5 -> System.out.println("Result: " + (num1 % num2));
            default -> System.out.println("Invalid choice.");
        }
    }

    /**
     * Displays a submenu for trigonometric operations.
     * Allows the user to perform operations like sin, cos, and tan.
     */
    private static void trigonometricMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Trigonometric Operators ---");
        System.out.println("1. Sin in Radian");
        System.out.println("2. Sin in Degree");
        System.out.println("3. Cos in Radian");
        System.out.println("4. Cos in Degree");
        System.out.println("5. Tan in Radian");
        System.out.println("6. Tan in Degree");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter the number: ");
        double number = sc.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Result: " + Math.sin(number));
            case 2 -> System.out.println("Result: " + Math.sin(Math.toRadians(number)));
            case 3 -> System.out.println("Result: " + Math.cos(number));
            case 4 -> System.out.println("Result: " + Math.cos(Math.toRadians(number)));
            case 5 -> System.out.println("Result: " + Math.tan(number));
            case 6 -> System.out.println("Result: " + Math.tan(Math.toRadians(number)));
            default -> System.out.println("Invalid choice.");
        }
    }

    /**
     * Displays a submenu for bitwise operations.
     * Allows the user to perform bitwise operations like AND, OR, XOR, etc.
     */
    private static void bitwiseMenu() {
        Scanner sc = new Scanner(System.in);
        Bitwise bitwise = new Bitwise();

        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("1. OR Operator");
        System.out.println("2. AND Operator");
        System.out.println("3. XOR Operator");
        System.out.println("4. Bitwise Inversion Operator");
        System.out.println("5. Left Shift");
        System.out.println("6. Right Shift");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                System.out.println("Result: " + bitwise.logicalOR(num1, num2));
            }
            case 2 -> {
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                System.out.println("Result: " + bitwise.logicalAND(num1, num2));
            }
            case 3 -> {
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                System.out.println("Result: " + bitwise.XOR(num1, num2));
            }
            case 4 -> System.out.println("Result: " + bitwise.bitwiseInversion(num1));
            case 5 -> {
                System.out.print("Enter the shift positions: ");
                int positions = sc.nextInt();
                System.out.println("Result: " + bitwise.leftShift(num1, positions));
            }
            case 6 -> {
                System.out.print("Enter the shift positions: ");
                int positions = sc.nextInt();
                System.out.println("Result: " + bitwise.rightShift(num1, positions));
            }
            default -> System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        createMenu();
    }
}