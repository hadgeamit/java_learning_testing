package String;

public class duplicateString {
	public static void main(String[] args) {
		int i,j;
		String[] a = {"abhi","aachal","amit","kd","chanchal","amit","kd"};
		System.out.println("Duplicate");
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					System.out.println(a[i]);
					
				}
			}
		}
	}

}
