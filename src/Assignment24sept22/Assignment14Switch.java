package Assignment24sept22;

import java.util.Scanner;

public class Assignment14Switch {

	public static void main(String[] args) {

		System.out.println("Enter county name :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		switch(str){
			case "India": System.out.println("Hockey");
			break;
			case "China":System.out.println("Table Tennis");
			break;
			case "Bangladesh":System.out.println("Kabaddi");
			break;
			case "Italy":System.out.println("FootBall");
			break;
			case "United State":System.out.println("BaseBall");
			break;
			default:System.out.println("Please try again");
		}
	}

}
