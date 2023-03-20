package methods;

public class behaviour {
	public void m1() {
		System.out.println("jvm read1");
	}
	public static void m2() {
		System.out.println("jvm read2");
	}
	public static void main(String[] args) {
		System.out.println("jvm read 3");
		behaviour on = new behaviour();
		m2();
		on.m1();
	}

}
