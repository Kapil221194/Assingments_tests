package Assignment3Sept22;

public class Assign13PredictOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				if(j==2)
				{
				  // break;   //code after break is not reachable.
				   System.out.println(j);
				}
				j++;
			}
			System.out.println(i);
		}
	}

}
