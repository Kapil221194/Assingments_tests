package Assignment27August22;
import java.util.Scanner;
public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int side=sc.nextInt();
		double area=(1.73*side*side)/4;
		System.out.println("Area of Equilateral Triangle = "+area);
	}

}
