package constructor;

public class datameminitilizationusingcon {
	int a;
	int b;
	int c;
	public datameminitilizationusingcon(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
			
	}
	public static void main(String[] args) {
		datameminitilizationusingcon on = new datameminitilizationusingcon(8,9,10);
		System.out.println(on.a);
		System.out.println(on.b);
		System.out.println(on.c);
	}

}
