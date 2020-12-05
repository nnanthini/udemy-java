package oops;

public class WrapperClass {
/*
 * used to wrap primitive variables.
 * Integer, Long, Float, Double, Byte, Boolean, Character, Short
 * int, long, float, double, byte, bool, char, short
 * 
 * Collections work only with wrapper class - so have to wrap primitive
 * types in wrapper class 
 * Collections work only with classes and objects, cant store primiteve types
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 10;
		Integer obj = new Integer(var); //wrapping -> Autoboxing
		System.out.println(obj);
		// doesnt print address of obj,  but it converts int primitive to object
		//it prints the value stored in obj
		int unwrappedvar = obj; //unwrapping -> Auto unboxing
		//collections take care of this automatically, autoboxing and unboxing
		System.out.println(unwrappedvar);
		String v = "98";
		Integer o =  new Integer(v);
		System.out.println(o);
		unwrappedvar = o;
		System.out.println(unwrappedvar);
		

	}

}
