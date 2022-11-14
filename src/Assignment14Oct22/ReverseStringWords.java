package Assignment14Oct22;

import java.util.Scanner;

public class ReverseStringWords {

	public static void reverseString(String s)
	{
		String reverse=" ";
		String sp[]=s.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			if(i!=0 && i!=sp.length-1) {
			String word=sp[i];
			String rev=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			reverse=reverse+rev;
		}
		}
		System.out.println(sp[0]+reverse+" "+sp[sp.length-1]);	}
	
	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		
		reverseString(str);
	}

}
