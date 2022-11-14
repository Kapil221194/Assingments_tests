package Assignment8Oct22;

import java.util.Scanner;

public class Assign2 {

	public static void swapFirstLast(int a[]) {
		int t1 = 0, t2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				t1 = a[0];
				a[0] = a[a.length - 1];
				a[a.length - 1] = t1;
			}
			if (i == 1) {
				t2 = a[1];
				a[1] = a[a.length - 2];
				a[a.length - 2] = t2;

			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array range: ");
		int num = sc.nextInt();

		int ar[] = new int[num];
		System.out.print("Enter array element: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		// call method
		swapFirstLast(ar);

	}

}
