package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Listss {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("2");
		list.add("3");
		list.add("4");
		Iterator loop= list.iterator();
		while(loop.hasNext()) {
			System.out.print(loop.next());
			System.out.print(" ");
		}
		
	}

}
