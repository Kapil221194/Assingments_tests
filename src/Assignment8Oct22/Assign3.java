package Assignment8Oct22;

import java.util.Scanner;

public class Assign3 {
	
	public static void Frequency(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			int c = 1;
			boolean isVisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] == a[k]) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						c++;
					}
				}
				//System.out.println("for frequency of element.");
				System.out.println(a[i] + " " + c);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range of array :");
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Enter element of array :");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("for frequency of element.");
		Frequency(ar);
	}

}
