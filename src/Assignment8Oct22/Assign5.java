package Assignment8Oct22;

import java.util.Arrays;

public class Assign5 {

	public static void SeparateDigit(int a[]) {
		int counter=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[counter] = a[i];
				counter++;
			}
		}
		while (counter < a.length) {
			a[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {

		int ar[]= {12, 0, 7, 0, 8, 0, 3};
		System.out.println(Arrays.toString(ar));
		SeparateDigit(ar);
	}

}
