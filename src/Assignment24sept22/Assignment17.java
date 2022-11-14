package Assignment24sept22;

class A1
{
	int x=1;
	void Show() {
		System.out.println(x);
	}
}
class A2 extends A1
{
	int x=2;
	void Show() {
		System.out.println(x);
	}
}
class A3 extends A2
{
	int x=3;
	void Show() {
		System.out.println(x);
	}
}

public class Assignment17 {

	public static void main(String[] args) {

		A3 a= new A3();
		a.Show();
		
	}

}
