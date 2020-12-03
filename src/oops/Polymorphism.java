package oops;

public class Polymorphism {
	/*
	 * same name mulitple forms
	 * 2 types
	 * compile time poly - overloading, early binding, static binding
	 * runtime poly - over riding, late binding, dynamic binding
	 * 
	 * Overloading (mustbe in same class)
	 * In same class, methods have same name but different method signature 
	 *  - different parameters (number or type or both)
	 *  Method signature - fn name + fn parameters
	 *  - overloading cant be achieved by changing return type - cos compiler cant verify return type while calling overloaded function
	 *  - ambiguity is possible if number of params is same, but types are interchanged.
	 *  - main methoda can be overloaded
	 *  - varargs (int ...a)
	 *  	- must be the last argument
	 *  	- only be one vararg
	 *  	- overlaoding vararg method might lead to ambiguity
	 * 
	 * Overriding 
	 * In different class(parent and child), methods with same signature
	 *   - done when parent cant fulfil a specific functionality of child
	 *   - return type cant be changed when it is primitive, it must be same as parent return type
	 *   - return type can be changed when it is covariant
	 *   covariant => return types are className and there is parent - child relationship between those classes
	 *             => then return type can be changed between the parent and child class
	 *             => primitives can be changed if used as wrapper classses
	 *             
	 *     Polymorphic reference
	 *     WebDriver driver = new ChromeDriver();
	 */

}
