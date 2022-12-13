package Assignment05Nov22;

public class Assignment5 {

	public static void main(String[] args) {

		D d = new D("Blue");
		System.out.println(d.color);
	}

}

class C {
	static int id;
	String name;

	C(int id) {
		this.id = id;
	}
}

class D extends C {
	String color;
	String type;

	D() {
		super(id);
		this.color = "Red";
	}

	D(String color) {
		this();
		this.color = color;
	}
}
