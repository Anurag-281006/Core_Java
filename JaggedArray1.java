//program to demonstrate 2-d jagged array

package proj2;

public class JaggedArray1 {
	class JaggedArray
	{
		public static void main(String args[])
		{
			
			//2-d array with 2 rows
			int arr[][]= new int[2][];
			
			//first row has 3 colums
			arr[0]=new int[3];
			
			//second row has 2 colums
			arr[1]= new int[2];
			
			//Initializing array
			int count=0;
			for (int i=0;i<arr.length;i++)
				for (int j=0;j<arr[i].length;j++)
					arr[i][j] = count++;
				
				//Display value of 2d jagged array
				System.out.println("2D jagged array");
				for (int i=0;i<arr.length;i++)
				{
					for (int j=0;j<arr[i].length;j++)
						System.out.println(arr[i][j] + " ");
					System.out.println();
				}
		}
	}
}
