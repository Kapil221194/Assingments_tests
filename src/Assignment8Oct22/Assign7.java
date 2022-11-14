package Assignment8Oct22;

public class Assign7 {
	
	public static void MaxOfRow(int a[][]) 
	{
		System.out.println("Max Of Row");
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			max=Integer.MIN_VALUE;
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.print(" "+ max);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int arr[][] = {{22, 31, 9}, {12, 25, 16}} ;
		System.out.println("Original array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		MaxOfRow(arr);
	}

}
