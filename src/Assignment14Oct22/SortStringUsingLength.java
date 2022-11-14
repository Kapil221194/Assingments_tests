package Assignment14Oct22;

import java.util.Scanner;

public class SortStringUsingLength {

	public static void sortString(String s)
	{
		String[] s1= s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].length()>s1[j].length())
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
							
				}
			}
		}
		for(int z=s1.length-1;z>=0;z--)
		{
			System.out.print(s1[z]+" ");
		}		
	}
	
	public static void main(String[] args) {

		System.out.println("Enter a string :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		sortString(str);
	}

}
