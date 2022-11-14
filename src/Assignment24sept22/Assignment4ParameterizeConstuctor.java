package Assignment24sept22;

class Car
{
	int model_no;
	String model_name;
	float price;
	
	Car(int model_no, String model_name, float price)
	{
		this.model_no=model_no;
		this.model_name=model_name;
		this.price=price;
	}
	public void Show()
	{
		System.out.println(model_no+"\n"+model_name+"\n"+price);
	}
}

public class Assignment4ParameterizeConstuctor {

	public static void main(String[] args) {

		Car c=new Car(221194, "Aventador", 3500000.0f);
		c.Show();
	}

}
