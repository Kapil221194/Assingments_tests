package Assignment18sept2022;

import java.util.Scanner;

public class FindNumberWithAllDigitEven {

	public static void main(String[] args) {

		System.out.print("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = 0, count = 0;

		if (num >= 100 && num <= 400) {

			while (num > 0) {
				r = num % 10;
				if (r % 2 == 0) {
					count++;
				}
				num = num / 10;
			}
			if(count==3) {
				System.out.println("Number has all even digit");
			}else {
				System.out.println("Please try again");
			}
		}else {
			System.out.println("Please try again");
		}

	}

}
