package array;

public class duplicatearray {
	public static void main(String[] args) {
		int[] a= {1,1,11,225,88,11,55,88,11};
		for( int i = 0; i<a.length; i++) {
			for(int j=1; j<a.length; j++) {
				if (a[i]==a[j])
					System.out.println(a[j]);
			}
		
			}
		
	}

}
	
