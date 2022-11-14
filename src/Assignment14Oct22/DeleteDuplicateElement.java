package Assignment14Oct22;

import java.util.Scanner;

public class DeleteDuplicateElement {
	
	public static void deleteElement(String str1, String str2)
	{
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			boolean isVisited=false;
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				System.out.print(ch1[i]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string :");
		String s1=sc.nextLine();
		System.out.println("Enter 2st string :");
		String s2=sc.nextLine();
		
		deleteElement(s1,s2);
	}

}
