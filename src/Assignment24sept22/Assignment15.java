package Assignment24sept22;

class Person {
public int number;
}

public class Assignment15 {

	public void doThis(int i, Person p) {
		i = 5;
		p.number = 8;
		}
	public static void main(String[] args) {

		int x = 0;
		Person p = new Person();
		new Assignment15().doThis(x, p);
		System.out.println(x + " " + p.number);
	}

}
