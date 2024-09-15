import java.util.Scanner;

public class AverageCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int count = 0;

        System.out.println("Enter a series of integers (enter a non-integer to calculate the average):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            total += num;
            count++;
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("The average of the " + count + " numbers is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        scanner.close();
    }
}
