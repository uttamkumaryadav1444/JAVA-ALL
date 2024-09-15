/*
Write a program to find the factorial of a number using recursive.
*/
import java.util.Scanner;
class Factorial
{
	//public static void main(String arg[])
	
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the positive number");
		
	public static int factorial(int n) 
	{
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positive number");
		int number=sc.nextInt();
        //int number = 5;
        int factorial = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }
	
}