package Assignment24sept22;

import java.util.Scanner;

class AutoMorphic {
	
	public void CheckAutoMorphic() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter nth number : ");
	int num = sc.nextInt();
	for(int i = 1;i<=num;i++)
	{

		int count = 0;
		int square = i * i;
		int temp = i;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		int lastDigit = (int) (square % (Math.pow(10, count)));
		if (num == lastDigit)
			System.out.println(i + " is an automorphic number.");
		//else
			//System.out.println(i + " is not an automorphic number.");
	}
	}
}

public class Assignment12 {

	public static void main(String[] args) {

		AutoMorphic at=new AutoMorphic();
		at.CheckAutoMorphic();
}
}