import java.util.Scanner;

public class AverageFORLOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        // Input loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        
        // Calculate the average
        double average = (double) sum / n;
        
        System.out.println("Average of the entered integers: " + average);
        
        scanner.close();
    }
}
