package array;

public class sortingofarray {
	public static void main(String[] args) {
		int [] a= {55,66,3445,223,554,65,45,44,334,32,233,21,22,333,2,12,343,33};
		
		//ascending aaray
		
		int empty;
		for(int i =0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				if(a[i]<a[j]) {
					empty=a[i];
					a[i]=a[j];
					a[j] = empty;
					
				}
			}
			System.out.println(a[i]+" ");
			
		}
		
	}

}
