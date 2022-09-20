package Assignment9sept22;

import java.util.Scanner;

public class CalculatorXpowerY {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base value :");
		int base=sc.nextInt();
		System.out.print("Enter power value :");
		int power=sc.nextInt();
		int cal=1;
		for(int i=1;i<=power;i++) {
			cal=cal*base;
		}
		System.out.println(base+"^"+power+" = "+cal);
	}

}
