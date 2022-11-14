package Assignment24sept22;

class CreditCard
{
	public int c;
}
class DebitCard
{
	public int d;
}

class Shopping
{
	public void doTransaction(int c) {
		c=1;
		System.out.println("You got 15% discount on bill on credit card transaction");
	}
	public void doTransaction(float d) {
		d=1.0f;
		System.out.println("No discount on bill on debit card transaction");
	}
}

public class Assignment16 {

	public static void main(String[] args) {

		CreditCard cr= new CreditCard();
		DebitCard dr= new DebitCard();
		Shopping s=new Shopping();
		s.doTransaction(cr.c);
		s.doTransaction(dr.d);
	}

}
