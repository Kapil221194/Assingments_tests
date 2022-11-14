package Assignment2Oct22;

import java.util.Arrays;
import java.util.Scanner;

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

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter array element :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		SeparateDigit(arr);
	}

}
