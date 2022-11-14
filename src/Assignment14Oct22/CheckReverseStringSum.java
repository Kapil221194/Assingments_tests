package Assignment14Oct22;

import java.util.Scanner;

public class CheckReverseStringSum {
	
	public static void checkReverseSum(String str)
	{
		int sum1=0, sum2=0;
		boolean isSum;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<3;j++)
			{
				sum1=sum1+Character.getNumericValue(str.charAt(j));
				
			}
			for(int j=str.length()-1;j>str.length()-3;j--)
			{
				sum2=sum2+Character.getNumericValue(str.charAt(j));
				
			}
		}
		System.out.println("sum1"+sum1);
		System.out.println("sum2"+sum2);
		
		if(sum1==sum2)
		{
			isSum=true;
		}else {
			isSum=false;
		}
		System.out.println(isSum);
	}

	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		checkReverseSum(st);
	}

}
