import java.util.Scanner;

public class Day6_Array{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int[] arr = new int[n];

      
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

      
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

       
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);

       
    }
}
