package array;

public class findminimumvalueofarrays {
	public static void m1(int[] a) {
		int g = a[0];
		for(int i=1; i<a.length; i++) 
			if(g>a[i])
				g=a[i];
		System.out.println("minimum value present in iquation="+g);
	}
	public static void main(String[] args) {
		int[] a = {55,7,88,32,8,34,22,11,45,6,66};
		m1(a);
	}
		
	

}
