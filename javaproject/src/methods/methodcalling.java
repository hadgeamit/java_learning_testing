package methods;

public class methodcalling {
	int a ;
	public static void main(String[] args) {
		methodcalling on1 = new methodcalling();
		methodcalling on2 = new methodcalling();
		methodcalling on3 = new methodcalling();
		methodcalling on4 = new methodcalling();
		on1.a = 12;
		on2.a= 13;
		on3.a= 14;
		on4.a = 17;
		System.out.println(on4.a);
		
	}

}
