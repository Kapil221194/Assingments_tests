package Assignment24sept22;

public class Assignment7Pattern {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(k);
			}
			int m=3;
			
			for(int l=2;l<=i;l++) {
				
				System.out.print(k);
			k++;
			}
			System.out.println();
		}
	}

}
