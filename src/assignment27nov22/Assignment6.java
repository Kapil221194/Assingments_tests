package assignment27nov22;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment6 {

	public static boolean checkAnagram(String str1, String str2) {
		boolean isAnagram = false;

		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		char[] ar1 = s1.toCharArray();
		char[] ar2 = s2.toCharArray();

		Arrays.sort(ar1);
		Arrays.sort(ar2);
		if (Arrays.equals(ar1, ar2) == true) {
			isAnagram = true;
		} else {
			isAnagram = false;
		}

		return isAnagram;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1 = sc.next();
		System.out.println("Enter 2nd string : ");
		String str2 = sc.next();

		boolean isAnagram = Assignment6.checkAnagram(str1, str2);
		System.out.println(isAnagram);
	}

}
