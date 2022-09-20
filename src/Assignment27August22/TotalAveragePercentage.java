package Assignment27August22;
import java.util.Scanner;
public class TotalAveragePercentage {

	public static void main(String[] args) {

		System.out.println("Enter Students marks :");
		Scanner sc = new Scanner(System.in);
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int total=m1+m2+m3+m4+m5;
		System.out.println("Total = "+total);
		float avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("Avarage = "+avg);
		float per=((m1+m2+m3+m4+m5)*100)/500 ;
		System.out.println("Percentage = "+per);
	}

}
