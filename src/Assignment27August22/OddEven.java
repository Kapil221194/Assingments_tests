package Assignment27August22;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=num%2;
		switch(result) {
		case 0:System.out.println("Even Number");
		break;
		case 1:System.out.println("Odd Number");
		break;
		default:System.out.println("Please try again.");
		}
	}

}
