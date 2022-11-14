package Assignment24sept22;

class SuperUse
{
	int id=2211;
	String name="rahul";
	public void ShowId() {
		System.out.println(id);
		}
	SuperUse(int age){
		System.out.println(age);
	}
}
class SuperUse1 extends SuperUse
{
	public void Show() {
	System.out.println(super.name);	 // call variable from super class
	super.ShowId();					//call method from super class
	}
	SuperUse1(){
		super(25);					// call constructor from super class
	}
}

class ThisUse
{
	int salary;
	String role;
	int exp;
	ThisUse(int salary, String role){
		this.role=role;					// refer to instance variable
		this.salary=salary;				// avoiding shadowing of instance variable	
	}
	ThisUse(int salary, String role, int exp)
	{
	this(salary,role);					// using constructor chaining
	this.exp=exp;
	}
	public void GetInfo() {
		System.out.println( salary +" "+ role +" "+exp);
		}
}
public class Assignment13Superthis {

	public static void main(String[] args) {
		SuperUse1 us=new SuperUse1();
		us.Show();
		ThisUse th=new ThisUse(75000, "Developer",4);
		th.GetInfo();
	}

}
