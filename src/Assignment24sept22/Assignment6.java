package Assignment24sept22;

public class Assignment6 {
	
	int x = 10;

	public void assign(int x) {
		x = x;
		System.out.println(this.x);
	}
	public static void main(String[] args) {

		new Assignment6().assign(100);

	}

}
