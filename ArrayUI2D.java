/*
Take user input for row and col value
*/
import java.util.Scanner;
class ArrayUI2D
{
	public static void main(String argm[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,row,col;
		System.out.println("How many Row Will Created");
		row=sc.nextInt();
		System.out.println("How many col will Created");
		col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(i=0;i<row;i++)// loop for row
		{
			for(j=0;j<col;j++)//loop for call
			{
				System.out.println("Enter array elements["+i+"]["+j+"]");
				arr[i][j]=sc.nextInt();//User input array elements
			}// end for inner for loop of col
		}// end of outer loop for row
	
	} // end for PSVM method
} // end of class