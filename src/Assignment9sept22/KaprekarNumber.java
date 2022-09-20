package Assignment9sept22;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		  int square = num*num;
	      int temp = square;
	      int count = 0, r, part1=0, part2=0, sum=0;
	      
	      while(temp>0) {
	    	  r=temp%10;
	    	  count++;
	    	  temp=temp/10;
	      }
	      for(int i=0;i<=(count-2);i++) {
	    	   part1=square/(int)Math.pow(10, i);
	    	   part2=square%(int)Math.pow(10, i);
	      }
	      //System.out.println("Part1 :"+part1);
	      //System.out.println("Part2 :"+part2);
	      if(part1 ==0 ||part2==0) {
	    	 // System.out.println("one of the part is 0");
	      }else {
	    	  sum=part1+part2;
	    	 // System.out.println("sum of two parts :"+sum);
	      }
	      if(sum==num) {
	    	  System.out.println("Number is Kaprekar Number");
	      }else {
	    	  System.out.println("Number is not Kaprekar Number");
	      }
	}

}
