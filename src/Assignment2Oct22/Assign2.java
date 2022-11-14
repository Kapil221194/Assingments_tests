package Assignment2Oct22;

public class Assign2 {

	static int mcCartyCounter =200;
	public static int mcCarthy(int n) {
	mcCartyCounter++;
	if (n > 100)
	return n - 10;
	else
	return mcCarthy(n+11);
	}
	
	public static void main(String[] args) {

		System.out.println (mcCarthy(100) + "  " + mcCartyCounter);
	}

}
