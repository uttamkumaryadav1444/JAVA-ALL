/*
3-D array
syntex:
datatype arrayname[][][][]=new datatype[][][];
3-D array:1
12
34
56

3-D array 2
11 12
13 14
15 16
{{1,2},{3,4},{5,6}}: 1Array with index[0],row[0][1][2]
arr[0][0:row][0:col]: 1
arr[1][1:row][0:col]: 2
arr[2][0:row][0:col]: 3
arr[3][1:row][0:col]: 4
arr[4][0:row][0:col]: 5
arr[5][1:row][0:col]: 6

*/
class Array3DU
{
	public static void main(String ar[])
	{
	int arr[][][]={{{1,2},{3,4},{5,6}},{{11,12},{13,14},{15,16}}};
	for(int i=0;i<arr.length;i++) //Array
	{
		System.out.println("3-D Array Display"+(i+1));
		for(int j=0;j<arr[i].length;j++)//row
		{
			for(int k=0;k<arr[i][j].length;k++)//col
			{
				System.out.print(" "+arr[i][j][k]);
			}//end col
			System.out.println(" ");
		}//end of row
	} //end of array
	}//end of PSVm of class
}//end of class