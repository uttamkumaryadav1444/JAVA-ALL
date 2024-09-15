/*
3*/
  
import java.util.*;
class Array3D1
{
	public static void main(String a[])
	{
		//Scanner sc=new Sca
	
	/*
	here 3-D array created
	with [2]:=2array created with
	size of row [3] :=3 row created
	size of col [3] :=3 col created
	*/
	int arr[][][]=new [2][3][3];
	Scanner sc=new Scanner(system.in);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Enter 3-D array value:"+(i+1));
		for(int j=0;j<arr[i].length;j++)//row
		{
			for(int k=0;k<arr[j].length;k++)//col
			{
				System.out.println("Enetr arr["+i+"]["+j+"]["+k+"]:=");
				int arr=sc.nextInt();
			}//inner loop of col
		}//end of outer loop of row
	}//end of i for loop for creating array with size 2
	}
}//end of psvm