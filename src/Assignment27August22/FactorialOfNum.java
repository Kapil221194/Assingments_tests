package Assignment27August22;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int fact=1;
		int fact1=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		for(int j=1;j<=num;j++) {
			
			if(num%j==0) {
				 fact1=j;
				 System.out.println("Factors of "+num+" is "+fact1);
			}
		}
	}

}
