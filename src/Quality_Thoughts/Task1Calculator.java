package Quality_Thoughts;

import java.util.Scanner;

public class Task1Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter first number: ");
                    num1 = getValidNumber(scanner);
                    System.out.print("Enter second number: ");
                    num2 = getValidNumber(scanner);

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
                            if (num2 != 0) {
                                System.out.println("Result: " + (num1 / num2));
                            } else {
                                System.out.println("Error! Division by zero.");
                            }
                            break;
                    }
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String answer = scanner.next().toLowerCase();
            if (!answer.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Simple Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    private static double getValidNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
}
