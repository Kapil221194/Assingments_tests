//write a program to sort ArrayList by decending without using sort method and without converting into array.	

package assignments03dec22;
import java.util.*;

public class Assign3 {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(22);
		al.add(1);
		al.add(24);
		al.add(10);
		al.add(2);
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1; j<al.size();j++)
			{
				Integer temp=0;
				if(al.get(i)<al.get(j))
				{
					temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
	}

}
