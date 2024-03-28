import java.util.Scanner;

 class Day04_StringMethods {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display the length of the input string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Display the string in uppercase
        System.out.println("Uppercase: " + inputString.toUpperCase());

        // Display the string in lowercase
        System.out.println("Lowercase: " + inputString.toLowerCase());

        // Prompt the user to enter a substring to search for
        System.out.print("Enter a substring to search for: ");
        String substring = scanner.nextLine();

        // Check if the substring exists in the input string
        boolean containsSubstring = inputString.contains(substring);
        if (containsSubstring) {
            System.out.println("Substring found in the input string.");
        } else {
            System.out.println("Substring not found in the input string.");
        }

        // Display the index of the first occurrence of the substring
        int index = inputString.indexOf(substring);
        if (index != -1) {
            System.out.println("Index of the first occurrence of the substring: " + index);
        } else {
            System.out.println("Substring not found in the input string.");
        }

       
    }
}
