/*
3-D ARRAY TAKE INPUT OF ROW AND COL FROM USRE DISPLAY
*/
import java.util.*;
class Array3DU11
{
	public static void main(String a[])
	{
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
			for(int k=0;k<arr[i][j].length;k++)//col
				{
				System.out.println("Enetr arr["+i+"]["+j+"]["+k+"]:=");
				int arr[i][j][k]=sc.nextInt();
				}//inner loop of col
			}//end of outer loop of row
		}//end of i for loop for creating array with size 2
		System.out.println("--------------Display array------------");
		for(int a=0;a<arr.length;a++)
		{
			System.out.println("3-D array"+(a+1));
			for(int b=0;b<arr[a].length;b++)//row
			{ 
				System.out.println("")
				for(int c=0;c<arr[a][b].length;c++)//col
				{
					System.out.print(" "+arr[a][b][c]);
				}//end of col loop to print col loop
				System.out.println(" ");
			}// end of rew loop
		}//end of array outer loop
		
	}//end of psvm
}//end of class