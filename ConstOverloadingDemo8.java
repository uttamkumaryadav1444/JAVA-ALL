class Addition
{
	int num1, num2, num3;
	Addition(int a, int b)
	{
		num1=a;
	    num2=b;
	    System.out.println("Addiotion of two numbers="+ (num1 + num2));
	}
	Addition(int a,int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
		System.out.println("Addition of 3 numbers="+(num1+num2+num3));
	}
}
	
class ConstOverloadingDemo8
{
	public static void main(String arg[])
	{
		Addition add2=new Addition(12,34);
		Addition add3=new Addition(15,37,23);
	}
	
}