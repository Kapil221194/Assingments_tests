package Assignment2Oct22;

import java.util.Arrays;

public class Assign12 {

	public static void ReplaceDigit(int a[], int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0) {
				a[i]=1;
			}
			
		}
		System.out.println("Replaced array :"+Arrays.toString(a));
	}
	
	public static void main(String[] args) {

		int arr[]= {26,0,67,45,0,78,54,34,10,0,34};
		int num=arr.length;
		System.out.println("Original array :"+Arrays.toString(arr));
		ReplaceDigit(arr, num);
	}

}
