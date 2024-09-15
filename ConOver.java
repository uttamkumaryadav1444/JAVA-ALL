/*
consttor overloading
*/
class Rect
{
	double len,wid;
	boolean isFilled;
	Rect() //default constructor
	{
	len=2.3;
	wid=3.4;
	isFilled=true;	
	}
	Rect(double l1,double wid1,boolean isF) // parameterized
	{
	len=l1;
	wid=wid1;
	isFilled=isF;
	}
	Rect(float l2,float w2,boolean f1)
	{
	len=l2;
	wid=w2;
	isFilled=f1;
	}
	/*Rect (double l3, double w3, boolean f2) //ambiguity
	{
		len=l3;
		wid=w3;
		isFilled=f2;
	}*/
	
}
class ConOver
{
	public static void main(String a[])
	{
	Rect r=new Rect();
	System.out.println("Default con len:"+r.len);
	Rect r1=new Rect(12.34,56.789,false);
	System.out.println("parameterized con len:"+r1.len);
	Rect r2=new Rect(3.4f,6.7f,true);
	System.out.println("float parameterized len:"+r2.len);
	
	
	}
}