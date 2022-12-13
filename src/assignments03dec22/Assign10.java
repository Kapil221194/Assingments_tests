package assignments03dec22;

import java.util.*;

public class Assign10 {

	public static void checkSum(int[] ar) {
		System.out.println("Pairs are ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if((ar[i]+ar[j])==10 &&i!=j)
				{
					System.out.println(ar[i]+" "+ar[j]);
				}

			}
		}
	}

	public static void main(String[] args) {

		int[] ar = { 4, 6, 5, -10, 8, 5, 20 };
		System.out.println("Array elements are");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		checkSum(ar);
	}

}
