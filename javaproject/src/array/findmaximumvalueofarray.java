package array;

public class findmaximumvalueofarray {
	public static void m1(int[] a) {
		int g=a[0];
		for(int i=1; i<a.length; i++)
			if(g<a[i])
				g=a[i];
		System.out.println("maximum value present in array =" +g);
	}
	public static void main(String[] args) {
		int[] a= {55,7,88,67,88,45,34,22,33,445,};
		m1(a);
	}

}
