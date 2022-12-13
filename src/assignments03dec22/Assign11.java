package assignments03dec22;


class Nib {
	String materialType;
	float width;

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public String getMaterialType() {
		return materialType;
	}

	public float getWidth() {
		return width;
	}

}

class Refill {
	String color;
	int length;
	Nib nb;

	public void setNib(Nib nb) {
		this.nb = nb;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Nib getNib() {
		return nb;
	}

	public int getLength() {
		return length;
	}

	public String getColor() {
		return color;
	}
}

class Pen {
	private Refill re;
	private int capLength;
	private String brand;

	public void setRefill(Refill re) {
		this.re = re;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Refill getRefill() {
		return re;
	}

	public int getCapLength() {
		return capLength;
	}

	public String getBrand() {
		return brand;
	}
}


public class Assign11 {

	public static void main(String[] args) {

		Pen p=new Pen();
		p.setBrand("Cello");
		p.setCapLength(2);
//		p.getRefill(new Refill().setColor("Blue"));
		System.out.println("Pen Brand :"+p.getBrand());
		System.out.println("Pen cap length :"+p.getCapLength()+"cm");
	
		Refill r=new Refill();
		r.setColor("Blue");
		r.setLength(6);
		System.out.println("Refill color :"+r.getColor());
		System.out.println("Refill length :"+r.getLength()+"cm");
		
		Nib n=new Nib();
		n.setMaterialType("Aluminium");
		n.setWidth(0.5f);
		System.out.println("Material of nib :"+n.getMaterialType());
		System.out.println("Width of nib :"+n.getWidth()+"mm");
		
		//p.setRefill(r.setColor("Blue"));
	}
}
