package assignment27nov22;

public class Assignment8 {

	static void pattern(int n) {
		int i, k, flag = 1;

		for (i = 1, k = 0; i <= 2 * n - 1; i++) {
			if (i < n - k)
				System.out.print(" ");
			else {
				if (flag == 1)
					System.out.print("*");
				else
					System.out.print(" ");
				flag = 1 - flag;
			}

			if (i == n + k) {
				k++;
				System.out.println();
				if (i == 2 * n - 1)
					break;
				i = 0;
				flag = 1;
			}
		}
	}

	public static void main(String[] args) {

		int n = 5;
		pattern(n);
	}

}
