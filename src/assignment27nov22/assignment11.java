package assignment27nov22;

public class assignment11 {

	int count = 0;

	void A() throws Exception
	{
		try
	{
		count++;
		try{
		count++;
		try{
			count++;
			throw new Exception();
			}
		catch(Exception ex)
		{
		count++;
		throw new Exception();
		}
		}
		catch(Exception ex)
		{
			count++;
			}
		}
		catch(Exception ex)
		{
			count++;}
		}
	

	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {

		assignment11 a=new assignment11();
		a.A();
		a.display();
		
	}

}
