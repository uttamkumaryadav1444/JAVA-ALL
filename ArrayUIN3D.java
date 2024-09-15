/*
Initializing array input using 3-D



*/
import java.util.*;
class ArrayUIN3D
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][][]=new int[2][3][3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter 3-D array elements"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++) 
				{
					System.out.println("enter elements arr["+i+"]["+j+"]["+k+"]:=");
					arr[i][j][k]=sc.nextInt();
					
				}//end of col for loop
			} // end of roe for loop
		} //end of array loop
		System.out.println("**********Display 3-D array**********");
		for(int a=0;a<arr.length;a++)
		{
			System.out.println("Display 3-D array"+(a+1));
			for(int b=0;b<arr[a].length;b++)
			{
				for(int c=0;c<arr[a][b].length;c++)
				{
					System.out.print("   "+arr[a][b][c]);
				}
				System.out.println(" ");
			}
		}
	}
}
