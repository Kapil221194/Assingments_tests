package Assignment3Sept22;

public class Assign12OddEvenNegativeSquare {

	public static void main(String[] args) {

		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				int num=i*(-1);
				int sq=i*i;
				System.out.println(num+" "+sq);
			}
		}
	}

}
