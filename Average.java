/*
Write a program to find out the average of a set of integers numbers.
*/
import java.util.Scanner.*;
class AverageS
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  numbers of integers");
		int n=sc.nextInt();
		int[]number=new int[n];
		
		System.out.println("Enter the integers");
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextInt();
		}
		float sum= 0;
		for(int i=0;i<n;i++);
		{
			sum +=numbers[i];
		}
		float averages = sum/n;
		System.out.println("Set of integrals"+ averages);
	}
}