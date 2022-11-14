package Assignment14Oct22;

import java.util.Scanner;

public class ReverseStringInPlace {

	public static void replaceInPlace(String s)
	{
		String reverse=" ";
		String []sp=s.split(" ");
		
		for(int i=0;i<sp.length;i++)
		{
			String rev=" ";
			String word=sp[i];
			
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			reverse=reverse+rev;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		
		replaceInPlace(str);
	}

}
