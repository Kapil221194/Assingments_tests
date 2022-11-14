package Assignment8Oct22;

import java.util.Arrays;

public class Assign1 {

	public static void mergeArray(int a[], int b[]) {
		
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		
		
		for(int z=0;z<c.length;z++) {
			System.out.print(c[z]+" ");
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr2[] = { 11, 22, 33, 44 };
		mergeArray(arr1, arr2);
	}

}
