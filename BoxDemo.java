/*
Program -1
*/
class Box
{
	float width;
	float heigth;
	float depth;
	//define volume
	void volume()
	{
		System.out.println("volume of box=");
		System.out.println(width*heigth*depth);
	}
	
}

class BoxDemo
{
	public static void main(String[]args)
	{
		Box b1 = new Box();
		Box b2 = new Box();
		//Assignment of b1 objects
		b1.width=10;
		b1.heigth=10;
		b1.depth=10;
		//Assignment of b1 objectsb1.width=10;
		b2.width=20;
		b2.heigth=20;
		b2.depth=20;
		System.out.println("Width of box"+b1.width);
		System.out.println("Width of box"+b1.heigth);
		System.out.println("Width of box"+b1.depth);
		b1.volume();
		System.out.println("Width of box"+b2.width);
		System.out.println("Width of box"+b2.heigth);
		System.out.println("Width of box"+b2.depth);
		//compute volueme
		//float vol;
		//vol=b1.width*b1.heigth*b1.depth;
		//System.out.println("Volume of box 1"+vol);
		//compute volume
		
		b2.volume();
		
	}
}