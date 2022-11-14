package Assignment24sept22;

import java.util.Scanner;

class Loan
{
	float pa;
	float rate1;
	float rate2;
	
	public void LoanCal(float pa, float rate1, float rate2) {
		this.pa=pa;
		this.rate1=rate1;
		this.rate2=rate2;
		
		float amount=pa*(rate1+rate2+100);
		
		System.out.println("Loan is "+amount);
	}
	
}

public class Assignment11 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle amount :");
		float p=sc.nextFloat();
		System.out.print("Enter 1st rate :");
		float r1=sc.nextFloat();
		System.out.print("Enter 2st rate :");
		float r2=sc.nextFloat();
		Loan l=new Loan();
		l.LoanCal(p, r1, r2);
	}

}
