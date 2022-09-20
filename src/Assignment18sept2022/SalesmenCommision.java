package Assignment18sept2022;

import java.util.Scanner;

public class SalesmenCommision {

	public static void main(String[] args) {

		System.out.print("Enter sale value : ");
		Scanner sc = new Scanner(System.in);
		float sale =sc.nextFloat();
		
		float comm= (float) ((sale>2000)?(sale*5/100):0.0);
		System.out.println(comm);
	}

}
