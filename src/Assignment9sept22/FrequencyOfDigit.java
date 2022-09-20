package Assignment9sept22;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[]args) {
		
		
		System.out.print("Enter mobile number :");
		Scanner sc = new Scanner(System.in);
		long num=sc.nextLong();
		int i;long  r;
		for(i=0;i<=9;i++) {
			long temp=num;  //otherwise after completing while loop for next i value num will be 0.
			int count=0;    //if count initialize outside for, last count will continue for next i value.
			while(temp>0) {
				r=temp%10;
				if(i==r) {
					count++;
				}
				temp=temp/10;
			}
			if(count>0)
			System.out.println(i+" "+count);
		}
		
	}
}
