package Assignment2Oct22;

import java.util.Scanner;

public class Assign1 {

	public static void CountOddEven(int a[]) {
		int odd = 0, even = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}

		}
		System.out.println("Even elements are :" + even + "\n" + "Odd elements are :" + odd);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length :");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("Enter array element :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		CountOddEven(arr);
	}

}
