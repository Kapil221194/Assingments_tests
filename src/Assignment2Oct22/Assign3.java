package Assignment2Oct22;

import java.util.Scanner;

public class Assign3 {
	
	public static void FreqOfChar(char a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)     //Back tracking, avoid repeatedly print the same value.
			{
				if(a[i]==a[k])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited ==false) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			System.out.println(a[i]+" "+count);
		}
		}
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array length :");
		int num =sc.nextInt();
		char arr[]=new char[num];
		System.out.println("Enter array length :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		FreqOfChar(arr);
	}

}
