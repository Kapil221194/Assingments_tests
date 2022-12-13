package assignment10dec22;

import java.util.*;

class Order {
	int orderId;
	String city;
	String itemName;
	String status;

	public Order(int orderId, String city, String itemName, String status) {
		this.orderId = orderId;
		this.city = city;
		this.itemName = itemName;
		this.status = status;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", city=" + city + ", itemName=" + itemName + ", status=" + status + "]";
	}

}

public class Flipkart {

	public static void main(String[] args) {

		ArrayList<Order> al = new ArrayList();
		al.add(new Order(1, "Pune", "Samsung TV", "Deliver"));
		al.add(new Order(2, "Pune", "Samsung mobile", "Deliver"));
		al.add(new Order(3, "Mumbai", "Vego cooler", "Pending"));
		al.add(new Order(4, "Mumbai", "Bajaj fan", "Deliver"));
		al.add(new Order(5, "Nagpur", "Titan watch", "Pending"));
		al.add(new Order(6, "Nagpur", "Fitness band", "Deliver"));

//		for(Order odr:al)
//		{
//			System.out.println(odr);
//		}

		TreeMap<String, Integer> tm = new TreeMap();
		for (int i = 0; i < al.size(); i++) {
			int count = 0;
			boolean isValid = false;
			for (int k = i - 1; k >= 0; k--) {
				if (al.get(i).city.equalsIgnoreCase(al.get(k).city)) {
					isValid = true;
					break;
				}
			}
			if (isValid == false) {
				for (int j = 0; j < al.size(); j++) {
					if (al.get(i).city.equalsIgnoreCase(al.get(j).city) && (al.get(j).status == "Pending")) {
						count++;
					}
				}
				//System.out.println(al.get(i).city+" "+count);
				tm.put(al.get(i).city, count);
			}
		}
		for(Map.Entry<String, Integer> m:tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}

class MyCom implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s2.compareTo(s2);
	}
}
