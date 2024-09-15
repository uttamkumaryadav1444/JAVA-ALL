/*
Write a program to find out the average of a set of integers numbers.
*/
import java.util.Scanner;

class AverageU
{
	public static void main(String art[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr the integras");
		int n=sc.nextInt();
	
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enetr thee intergras"+(i + 1)+" : ");
			int num=sc.nextInt();
		
			sum +=num;
		}
		double average = sum / n;
		System.out.println("total average is : "+average);	
	}
	
}