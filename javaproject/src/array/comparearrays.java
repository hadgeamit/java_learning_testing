package array;

import java.util.Arrays;

public class comparearrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {11,12,13,14,15};
		int[] c= {1,2,3,4,5};
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a,c));
	}

}
