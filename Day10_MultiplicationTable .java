// Java Program to print the multiplication table of the
import java.util.Scanner;

class Day10_MultiplicationTable {
    public static void main(String[] args) {
     
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number to print the multiplication table");
        int N=sc.nextInt();

    
        for (int i = 1; i <= 10; i++) {
           
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
