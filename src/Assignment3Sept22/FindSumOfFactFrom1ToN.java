package Assignment3Sept22;

import java.util.Scanner;

public class FindSumOfFactFrom1ToN {

	public static void main(String[] args) {

		System.out.println("Enter the last digit :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1, sum=0;
		
		for(int i=1;i<=num;i++) {
			 fact=fact*i;
			 sum=sum+fact;
		}
		 //System.out.println(fact);
		 System.out.println(sum);
	}

}
