package polymorphism;

public class ovrloading {
	public void t1() {
		System.out.println("t1 is of ovrloading");
	}
	public void t1(int a) {
		System.out.println("t1 with int and argument");
	}
	public static void main(String[] args) {
		ovrloading on =new ovrloading();
		on.t1();
		on.t1(77);
		
	}
	

}
