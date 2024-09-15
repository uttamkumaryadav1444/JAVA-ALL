/*
Write a program to perform the following arithmetic operation.
Take the input from the user.  addition ,subtraction ,multiplication and division.  
*/
import java.util.Scanner;
class Arthimatic
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number num1");
		int num1=sc.nextInt();
		System.out.println("Enter the number num2");
		int num2=sc.nextInt();
		
		int result=num1+num2;
		System.out.println("Addition is="+result);
		int result1=num1-num2;
		System.out.println("Addition is="+result1);
		int result2=num1*num2;
		System.out.println("Addition is="+result2);
		int result3=num1/num2;
		System.out.println("Addition is="+result3);
		
		
	}
}
