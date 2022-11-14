package Assignment8Oct22;

import java.util.Arrays;

public class Assign4 {

	public static void rearrange(int a[]) {

		for (int i = 0; i < a.length; i++) {
			
		}

		System.out.println("Rearranged array :");
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, -4, -1, 4 };

		System.out.println("Original array :");
		System.out.println(Arrays.toString(ar));

		rearrange(ar);
	}

}
