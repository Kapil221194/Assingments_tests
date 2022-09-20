package Assignment18sept2022;

import java.util.Scanner;

public class ServiceArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter sex : ");
		char sex=sc.next().charAt(0);
		System.out.print("Enter age : ");
		int age=sc.nextInt();
		System.out.print("Enter marital status : ");
		char marital_status=sc.next().charAt(0);
		
		if(sex=='F' || sex=='f') {
			System.out.println("Works only in urban area.");
		}else if((sex=='m'||sex=='M')&&(age>=40 && age<=60)){
			System.out.println("Works only in urban area.");
		}else if((sex=='m'||sex=='M')&&(age>=20 && age<40)){
			System.out.println("May work anywhere.");
		}else {
			System.out.println("ERROR");
		}
		
	}

}
