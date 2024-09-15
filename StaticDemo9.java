class Student
{
	int a;
	static int b;
	Student()
	{
		b++;
	}
	void showData()
	{
		System.out.println("Value of a "+ a);
		System.out.println("Value of b "+ b);
	}
}
class StaticDemo9
{
	public static void main(String arf[])
	{
		Student s1=new Student();
		s1.showData();
		Student s2=new Student();
		s2.showData();
		Student s3=new Student();
		s3.showData();
		//Student.b++
		s2.showData();
	}
}