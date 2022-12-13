//Write a java program to Remove duplicate elements from ArrayList.

package assignments03dec22;

import java.util.*;

public class Assign4 {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(7);
		al.add(4);
		al.add(7);
		al.add(11);
		al.add(11);
		al.add(16);
		System.out.println("Input "+al);
		
		for(int i=0; i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					al.remove(j);
				}
			}
		}
		System.out.println("Output"+al);		
		
	}

}
