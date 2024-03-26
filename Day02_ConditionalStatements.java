import java.util.Scanner;

public class Day02_ConditionalStatements {

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 1. Introduction to Conditional Statements
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // 2. if Statement
        System.out.println("\n2. if Statement");
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // 3. else Statement
        System.out.println("\n3. else Statement");
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // 4. else if Statement
        System.out.println("\n4. else if Statement");
        System.out.println("Enter a number between 1 and 3:");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("You entered 1.");
        } else if (num == 2) {
            System.out.println("You entered 2.");
        } else if (num == 3) {
            System.out.println("You entered 3.");
        } else {
            System.out.println("Invalid input.");
        }

        // 5. Switch Statement
        System.out.println("\n5. Switch Statement");
        System.out.println("Enter a number between 1 and 3:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            default:
                System.out.println("Invalid input.");
        }

        // 6. Ternary Operator
        System.out.println("\n6. Ternary Operator");
        int marks = 75;
        String result = (marks >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

    }
}
