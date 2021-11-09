package Array;

public class Array2 {
	public static void main(String[] args) {
		//int [][]arr = {
			//	{11,22,33,44},
				//{22,44,88,99}
		int[][] arr = new int [2][3];
		arr[0][0]=11;
		arr[0][1]=22;
		//};
	//	System.out.println(arr[0][2]);
		for (int i=0;i<2;i++)  
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
			
		}
		
	}

}
