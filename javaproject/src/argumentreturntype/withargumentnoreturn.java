package argumentreturntype;

public class withargumentnoreturn {
	public void m1(int a) {
		System.out.println(a);
	}
	public static void m2(boolean c) {
		System.out.println(c);
	}
	public static void main(String[] args) {
		withargumentnoreturn on = new withargumentnoreturn();
		on.m1(100);
		m2(true);
	}

}
