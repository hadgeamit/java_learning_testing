package argumentreturntype;

public class withoutargumentandwithreturn {
	public int m1() {
		return 55;
	}
	public static boolean m2() {
		return true;
	}
	public static void main(String[] args) {
		withoutargumentandwithreturn on = new withoutargumentandwithreturn();
		System.out.println(on.m1());
		System.out.println(m2());
	}

}
