class  Student
{
	int a;
	static int b;
}
class StsticDemo1
{
	public static void main(String ard[])
	{
		Student s1=new Student();
		s1.a=10;
		System.out.println("value of a ="+ s1.a);
		Student.b=20;
		System.out.println("value of b ="+ Student.b);
	}
}