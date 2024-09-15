/*
Write a program to display the sum of n numbers using an array.
*/
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of elements
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create an array to store the numbers
        int[] arr = new int[n];

        // Get the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Display the sum
        System.out.println("The sum of the elements is " + sum);
    }
}
