import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");

        // Read the user input as an integer
        int num = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        int a = 0, b = 1;
        
        // Here we are printing 0th and 1st terms
        System.out.print(a + " , " + b + " , ");
        
        int nextTerm;

        // Printing the rest of the terms here
        for (int i = 2; i < num; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " , ");
        }
    }
}
