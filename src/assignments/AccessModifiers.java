package assignments;

public class AccessModifiers {
	/*
	 * public 
	 * protected
	 * private 
	 * default - if nothing is specified
	 * 
	 * 
	 * class level - public or default
	 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * public - can be accessed anywhere in the java with imports
	 * default - only withing the same package
	 * protected and private cant be used at class level
	 * =========================================================
	 * 			within same pkg    outside pkg
	 * public	    accessible		accessible with import
	 * default      accessible		not accessible
	 * ==========================================================
	 * 
	 * member level - public, protected, private, default
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	 * public - throughout java
	 * private - only within the class
	 * protected - accessible within same package, outside package it has to be inherited
	 * default - only within the same package
	 * =======================================================================================
	 * 				within same class     outside class, same pkg     outside pkg       outside pkg with inheritance      Most restricted      Most visible
	 *
	 * public			accessible			accessible					accessible			accessible						4
	 * default			accessible			accessible					not accessible		not accessible					2
	 * protected		accessible			accessible					not accessible		accessible with child object	3				
	 * private			accessible			not accessible				not accessible		not accessible					1
	 * ========================================================================================
	 * 
	 * 
	 * 
	 */

}
