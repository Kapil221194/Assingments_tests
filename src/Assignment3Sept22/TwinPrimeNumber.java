package Assignment3Sept22;

import java.util.Scanner;

public class TwinPrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter two Number :");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int count1=0, count2=0;
		
		for(int i=1;i<=num1;i++) {
			if(num1%i==0 ) {
				count1++;
			}
		}
		for(int i=1;i<=num2;i++) {
			if(num2%i==0 ) {
				count2++;
			}
		}
		int diff=num2-num1;
		if((diff==2 || diff==-2) && count1==2 && count2==2) {
			System.out.println("Number is twin Prime");
			
		}else {
			System.out.println("Number is not Prime");
		}
		
	}
}
