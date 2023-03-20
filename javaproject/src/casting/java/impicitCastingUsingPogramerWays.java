package casting.java;

public class impicitCastingUsingPogramerWays {
	public static void main(String[] args) {
		String a = "ginger";
		String b = "ginger";
		String c = new String("ginger");
		
		System.out.println( a==c);
		System.out.println(a.equals(c));
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
	
	}

}
