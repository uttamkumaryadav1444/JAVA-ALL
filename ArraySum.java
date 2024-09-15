/*
Write a program to display the sum of n numbers using an array
*/
import java.util.Scanner;

public class ArraySum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements (n)
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize an array to store the numbers
        double[] numbers = new double[n];

        // Input: Enter n numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the sum
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        // Display the result
        System.out.println("The sum of " + n + " numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
