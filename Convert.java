/*
Write a program to convert the temperature in Centigrade to Fahrenheit.
*/
import java.util.Scanner;
class Convert
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Centigram number");
		double celsias=sc.nextDouble();
		double Faherenheit=(celsias*9/5)+32;
		System.out.println("Temperature in faherenheit"+Faherenheit);
	}
}