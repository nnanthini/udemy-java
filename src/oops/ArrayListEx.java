package oops;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListEx {
	/*
	 * 
	 * under List interface
	 * 
	 * 
	 */
	
	public void show() {
		
	}
	public void get() {
		
	}
	public void put() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		System.out.println(list); //if no object inside, it will print [] - empty list
		System.out.println(list.size());
		
		list.add(10); //value will converted into object of the primitive type - autoboxing
		 list.add("jkl");
		 list.add(89.98);
		 list.add('h');
		 System.out.println(list);
		 list.add(null);
		 list.add(true);
		 list.add("jkl"); //can have duplicate values
		 //all these are converted to their respective boxed class, 
		 //and that in turn is polymorphic referenced to Object class,
		 //hence can store all types of values in the same list
		 System.out.println(list);
		 System.out.println(list.size());
		 
		 
		 System.out.println(list.get(1));
		 
		 list.remove(2);
		 System.out.println(list);
		 System.out.println("Using for loop");
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 
		 System.out.println("Using for each loop");
		 for(Object o:list) {
			 System.out.println(o);
		 }
		 
		 System.out.println("Using iterator ");
		 Iterator itr = list.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 //If array can store all values, then it wont be possible to know what values are stored
		 //Reusults in tpyecasting issues
		 //So generics are used with ArrayList
		 
		 
		 
		 
		 
		 
		 
		

	}

}
