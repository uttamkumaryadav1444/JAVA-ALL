/*
Write a program to check whether the given integer number is a multiple of 5 .
*/
import java.util.Scanner;
class NumberCheck
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integers number");
		int n=sc.nextInt();
		if(n % 5==0)
			System.out.println(n  +  "multiple by 5 the given number");
		else
			System.out.println(n  +  "Note multiple by the given number of 5");
	}
}