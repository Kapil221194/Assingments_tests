package Assignment9sept22;

import java.util.Scanner;

public class Assign5Series {

	public static void main(String[] args) {

		System.out.print("Enter number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		System.out.print(sum+",");
		for(int i=1;i<=num-1;i++) {
			int n=2;
			for(int j=1;j<=i;j++) {
			sum=j*j+n;
			n+=2;
			}
			System.out.print(sum+",");
		}
		
	}

}
