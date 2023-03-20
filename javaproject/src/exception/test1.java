package exception;

public class test1 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			System.out.println(100/0);
		}
		catch (ArithmeticException ref) {
			System.out.println(ref.getMessage());
			
		}
		System.out.println(4);
		System.out.println(5);
			
		}
		
		
		
	
		

}

