package assignment27nov22;

import java.util.Scanner;

public class Assignment9 {

	public static void digitSum(int num)
	{
		
		int sum=0, n=num;
		while(num!=0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("Sum of "+ n +"'s digit is "+sum);
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		digitSum(num);
	}

}
