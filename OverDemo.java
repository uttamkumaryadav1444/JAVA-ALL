/*
method overloding : method name same,but number of arguments different and return also different
*/
class MethOver
{
	public int add(int a ,int b)
{return a+b;}
public int add(int a,int b,int c)
{return a+b+c;}
public double add(double a,double b)
{return a+b;}
}
class OverDemo
{
	public static void main(String argd[])
	{
		MethOver m=new MethOver();
		System.out.println("Add of two arguments:"+m.add(10,20));
		System.out.println("Add of Three arguments:"+m.add(10,20,19));
		System.out.println("Add of double type:"+m.add(10.23,20.34));
		
	}
}