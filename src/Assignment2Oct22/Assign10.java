package Assignment2Oct22;

import java.util.Scanner;

public class Assign10 {
	
	static void PerfectSquares(int a[], int N)
	{
	    for (int i = 0; i < 100; i++)
	    {
	        int square = i * i;
	        for (int j = 0; j < N; j++)
	        {
	            if (a[j] == square)
	            {
	            	System.out.println(a[j]);
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {

		int arr[] = {23,43,25,49,12,9,78,66,39,0};
	    int num = arr.length;
		
		PerfectSquares(arr,num);	
	}

}
