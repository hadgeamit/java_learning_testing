package argumentreturntype;

public class withargumentandwithreturntype {
	public void m1() {
		System.out.println("with argument");
	}
	public static void m2() {
		System.out.println("with argument and with return");
	}
	public static void main(String[] args) {
		withargumentandwithreturntype on = new withargumentandwithreturntype();
		on.m1();
		m2();
	}

}
