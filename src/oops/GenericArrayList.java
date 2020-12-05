package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(98);
		list.add(76);
		list.add(22);
		list.add(null);//null can be added to list of anytype
		list.add(74);
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
