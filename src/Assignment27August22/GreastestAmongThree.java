package Assignment27August22;

import java.util.Scanner;

public class GreastestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter three number : ");
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int n3 =sc.nextInt();
		int max=(n1>n2 && n1>n3)?n1:(n2>n3 && n2>n1)?n2:n3;
		System.out.println("Greatest number is : "+max);
	
	}

}
