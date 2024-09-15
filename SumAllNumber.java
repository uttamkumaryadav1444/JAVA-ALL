/*
Write a program to find the sum of the digits of an integer using a while loop.
*/
import java.util.Scanner;
class SumAllNumber
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number");
		int n=sc.nextInt();
		int sum = 0;
		while(n != 0)
		{
			// Get the last digit of the number
			int digit = n % 10;
		    sum += digit;
			// Remove the last digit from the number
		    n /= 10;
		System.out.println("sum of number" + sum);
		
		//Scanner.close();
		}
			
	}
}