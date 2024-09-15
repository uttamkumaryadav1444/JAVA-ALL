/*
Write a Program to Display all the multiples of 3 within the range of 10 to 50.
*/
class Range
{
	public static void main(String a[])
	{
		int start =10;
		int end = 50;
		System.out.println("Multiples of 3 within the range of 10 to 50:");
		for(int i =start;i <= end; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
			}
				
		}
	}
}