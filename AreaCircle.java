/*
Write a program to calculate the area of Circle.
*/
import java.util.Scanner;
class AreaCircle
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious");
		int radious=sc.nextInt();
		double Circle=(3.14*radious*radious);
		System.out.println("Area of circle"+Circle);
	}
}