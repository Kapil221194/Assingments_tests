//WAP to convert ArrayList to array in 2 different ways and array to ArrayList in 2 
//different ways (so total 4 ways) 

package assignments03dec22;

import java.util.*;

public class Assign1 {

	public static void main(String[] args) {

		System.out.println("Convert ArrayList into Array");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.print(list + "\n");
		Object[] num = list.toArray();
		System.out.println("\n1st way \n" + Arrays.toString(num));
		Integer[] num1 = new Integer[list.size()];
		num1 = list.toArray(num1);
		System.out.print("\n2nd way \n");
		for (Integer n : num1) {
			System.out.println(n + " ");
		}
		Integer[] num2 = new Integer[list.size()];
		for (int i = 0; i < list.size(); i++) {
			num2[i] = list.get(i);
		}
		System.out.println("\n3rd way");
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i] + " ");
		}

		System.out.println("\nConvert ArrayList into Array");
		String[] str = { "pune", "nagpur", "mumbai", "delhi" };
		System.out.println(Arrays.toString(str));
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		System.out.println("\n1st way");
		System.out.println(al);
		
		List<String> al1 = new ArrayList<String>();
		Collections.addAll(al1, str);
		System.out.print("\n2nd way \n");
		System.out.println(al1);
		
		List<String> al2 = new ArrayList<String>();
		for(String s:str)
		{
			al2.add(s);
		}
		System.out.print("\n3rd way \n");
		System.out.println(al2);
		
		

	}

}
