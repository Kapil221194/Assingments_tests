package assignment12nov22;

import java.util.Scanner;

public class Assign01 {

	public static void CheckPasswd(String passwdList, String checkstr) {
		int valueatfirst = Character.getNumericValue(checkstr.charAt(0));
		int valueatlast = Character.getNumericValue(checkstr.charAt(checkstr.length() - 1));

		String[] passwd = passwdList.split(",");
		for (int i = 0; i < passwd.length; i++) {
			String word = passwd[i];
			int cap = 0;

			int sum = 0;
			for (int j = 0; j < word.length(); j++) {
				if (Character.isDigit(word.charAt(j))) {
					sum = sum + Character.getNumericValue(word.charAt(j));
				}
			}

			for (int l = 0; l < word.length(); l++) {
				char ch = word.charAt(l);
				if (ch >= 'A' && ch <= 'Z') {
					cap++;
				}
			}

			if (cap == valueatfirst) {
				if (checkstr.charAt(1) == word.charAt(word.length() - 1)
						&& checkstr.charAt(2) == word.charAt(word.length() - 2)
						&& checkstr.charAt(3) == word.charAt(word.length() - 3)) {
					if (sum == valueatlast) {
						System.out.println("Password id : " + word);
					}
				}
			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password list : ");
		String passwdList = sc.nextLine();
		System.out.println("Enter check string : ");
		String checkStr = sc.nextLine();

		CheckPasswd(passwdList,checkStr);
		
	}

}
