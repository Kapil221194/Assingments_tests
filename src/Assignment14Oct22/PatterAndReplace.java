package Assignment14Oct22;

public class PatterAndReplace {

	public static void replaceChara(String st)
	{
		String st3=st.toLowerCase();
		String st2=st3.replace('i', '@');
		String[] st1=st2.split(" ");
		
		
		for(int i=0;i<st1.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(st1[j] +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		String s="India is my country";
		
		replaceChara(s);
	}

}
