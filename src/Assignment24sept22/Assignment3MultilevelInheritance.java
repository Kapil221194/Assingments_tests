package Assignment24sept22;

class Account{
	
	int ac_num = 12345;
	String ac_type = "Saving";
	int amount = 10000;
	void Show() {
		System.out.println("Account number "+ac_num +"\n"+"Account type "+ac_type+"\n"+"Account balance "+amount);
	}
}
class Withdrawl extends Account{
	
	void Deduction(int d) {
		System.out.println("\n"+"Withdrawl of "+d+"\n"+"Balance "+(amount - d));
	}
	
}

public class Assignment3MultilevelInheritance {

	public static void main(String[] args) {

		Withdrawl w=new Withdrawl();
		w.Show();
		w.Deduction(500);
	}

}
