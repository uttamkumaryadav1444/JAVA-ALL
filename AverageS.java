/*
Write a program to find out the average of a set of integers numbers.
*/
public class AverageS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / n;

        System.out.println("The average is " + average);
    }
}