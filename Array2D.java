/*
2-D Array
*/
class Array2D
{
	public static void main(String arg[])
	{
		//int a[][]={{1,2,3},{4,5,6}};
		float farr[][]={{2.3f,4.5f},{23.5f,56.8f}};
		// Intitialization of 2-D
		System.out.println("farr[0][0]:"+farr[0][0]);
		//print 1 elememt
		System.out.println("Display 2-D Array float");
		//Outer loop for row with index a[0]
		for(int i=0;i<farr.length;i++)//row
		{// Inner loop for col with inder a[0]
			for(int j=0;j<farr[i].length;j++)//col
			{
				System.out.print("    "+farr[i][j]);
			}
			System.out.println("");
		}	// end of outer for loop
		System.out.println("Float 2-D Array");
	}// end of PSVM method
}// end of  class
