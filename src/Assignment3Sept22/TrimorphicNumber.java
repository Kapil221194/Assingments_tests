package Assignment3Sept22;

import java.util.Scanner;

public class TrimorphicNumber {

	public static void main(String[] args) {

		System.out.print("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int cube=num*num*num;
		int	last_digit=cube%10;
		
		if(last_digit==num) {
			System.out.println("Number is Trimorphic Number");
		}else {
			System.out.println("Number is not Trimorphic Number");
		}
			
	}

}
