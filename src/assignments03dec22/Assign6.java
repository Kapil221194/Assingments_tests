//Extract the portions of List.

package assignments03dec22;
import java.util.*;

public class Assign6 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("maz");
		al.add("Angle");
		al.add("cloe");
		al.add("lucifer");
		al.add("lopez");
		System.out.println(al);
		
		List<String> sub_al= al.subList(0, 3);
		System.out.println(sub_al);
	}

}
