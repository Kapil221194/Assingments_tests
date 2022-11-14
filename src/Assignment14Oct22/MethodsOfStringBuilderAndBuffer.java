package Assignment14Oct22;

public class MethodsOfStringBuilderAndBuffer {

	public static void main(String[] args) {

		StringBuffer s=new StringBuffer("Java");
		System.out.println(s.append(" Code"));
		System.out.println(s.insert(0, "Like "));
		System.out.println(s.replace(11, 13, "@"));
		System.out.println(s.delete(0, 4));
		System.out.println(s.reverse());
		System.out.println(s.capacity());
	}

}
