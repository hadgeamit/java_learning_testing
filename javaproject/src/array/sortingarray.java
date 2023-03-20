package array;

public class sortingarray {
	private static int i;

	public static void main(String[] args) {
		int[] a = { 23,56,55,123,3234,64535,34,66,556,78,99,78,67,54,34,21,22,4,334,7888,67,56,45,78,43,23,2,4,3,6,77,55,4466,887,};
		
		//ascending of array
		int empty;
		for(int i=0; i<=a.length; i++)
		{
		
		
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j]) {
			empty=a[i];
			a[i]=a[j];
			a[j]=empty;
			
		}
		
		}
		System.out.println(a[i]+" ");
		
	}
}
}
