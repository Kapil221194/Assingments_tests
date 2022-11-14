package Assignment05Nov22;

 interface Car {                        // remove public access modifier
	public void drive();
}

public class assignment10 {

	public static void main(String[] args) {
		Car car = new Swift();
		car.drive();
	}
}

class Swift implements Car {
	public void drive() {                    //change visibility from protected to private
		System.out.println("I am driving");
	}

}
