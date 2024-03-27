import java.util.Scanner;

public class Day03_Loops{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simple for Loop
        System.out.println("Simple For Loop Example:");
        System.out.println("Printing numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        // Nested for Loop
        System.out.println("Nested For Loop Example:");
        System.out.println("Printing combinations of numbers from 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
        
        // Pyramid Pattern
        System.out.println("Pyramid Pattern Example:");
        System.out.println("Enter the number of rows for the pyramid:");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}
