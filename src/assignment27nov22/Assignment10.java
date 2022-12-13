package assignment27nov22;

public class Assignment10 {

	public static void stringPattern(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j));
			}

			System.out.println();
		}
		for (int i = 0; i < str.length(); i++) {
			for (int k = i+1; k < str.length(); k++) {
				System.out.print(str.charAt(k));
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		String str = "ESHAN";

		stringPattern(str);
	}

}
