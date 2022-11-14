package Assignment8Oct22;

import java.util.Arrays;

public class Assign6 {

	static void reverseArray(int a[][]) {
		System.out.println("Reverse array");
		for (int i = a.length-1; i >=0; i--) {
			for(int j=a[i].length-1;j>=0;j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	public static void main(String[] args) {

		int ar[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		System.out.println("Original array");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		// calling method
		reverseArray(ar);
	}

}
