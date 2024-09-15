/*
Write a program to find the product of real numbers.
*/
import java.util.Scanner;
class RealProduct
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Real numbers");
		int n=sc.nextInt();
		double product = 1.0;
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enetr the intergs"+(i + 1)+" : ");
			double num = sc.nextDouble();
			product *= num; 
		}
		System.out.println("total Real product is : =" + product);
		
		
	}
}