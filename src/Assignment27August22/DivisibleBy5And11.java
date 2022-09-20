package Assignment27August22;

import java.util.Scanner;

public class DivisibleBy5And11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i=sc.nextInt();
		if(i%5==0 && i%11==0)
		{
			System.out.println("Number is divisible by 5 and 11");
		}else {
			System.out.println("Number is not divisible by 5 and 11");
		}
	}

}
