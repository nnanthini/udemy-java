package oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	/*
	 * set is unordered unlike list
	 * set doesnt store duplicate values unlike list
	 * cant fetch index wise values from set unlike list
	 * 
	 * 
	 * In Selenium, usually window id's are stored in set,
	 * because we dont want duplicate window handles
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("abc");
		set.add("nn");
		set.add("xyz");
		set.add("nn");
		set.add("opop");
		set.add(null);
		
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s);
		}
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		
		
		
	}

}
