package Assignment2Oct22;

import java.util.Arrays;
import java.util.Scanner;

public class Assign6 {

	public static void RemoveDuplicate(int a[],int n) {

		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]!=a[j])
				{
					System.out.println(a[i]);
					break;
				
				}
			}
		}
		
	}
	
	public static void main(String[] args) {

		 int arr[] = {4, 3, 2, 4, 9, 2};  
	        int length = arr.length;
	        RemoveDuplicate(arr, length);  
	}
}
