/*
Write a program to find the largest number in an array.
*/

import java.util.Scanner;

public class LargestNumber {

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

        // Initialize the largest number
        int largestNumber = arr[0];

        // Find the largest number in the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        // Print the largest number
        System.out.println("The largest number in the array is " + largestNumber);
    }
}
