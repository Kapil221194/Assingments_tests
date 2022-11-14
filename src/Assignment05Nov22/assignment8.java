package Assignment05Nov22;

public class assignment8 {

	public static void main(String[] args) {
		Abs2 abs = new Abs2();
		
		abs.move();        // call methods
		abs.show();
	}
}

abstract class Abs1 {
	int num;

	public abstract void move();
}

class Abs2 extends Abs1 {
	
	public void move()							//provide implementation to move method from abs1.
	{
		System.out.println("in move method");
	}
	public void show() {
		System.out.println("in show method");
	}
}
