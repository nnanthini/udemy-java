package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	/*
	 * key-value pairs
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("firstname", "Nanthini");
		map.put("lastname", "Nagendran");
		map.put("age", "28");
		map.put("subject", null);
		map.put("firstname","Raagul"); //same key if we put again, it will overwrite the first value
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("firstname"));
		
		System.out.println(map.keySet()); //retunrns Set, because key is always unique
		
		Set<String> keys = map.keySet();
		for (String key:keys) {
			System.out.println("Key "+key+" Value "+map.get(key));
		}
		
		
		Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		List<String> email = new ArrayList<String>();
		email.add("xyz");
		email.add("abc");
		email.add("opop");
		map1.put("email", email);
		map1.put("email2", email);
		System.out.println(map1);

	}

}
