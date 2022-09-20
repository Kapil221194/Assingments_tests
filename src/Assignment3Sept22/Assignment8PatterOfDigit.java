package Assignment3Sept22;

public class Assignment8PatterOfDigit {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			int n=0;	
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(++n);
			}
			System.out.println();
		}
	}

}
