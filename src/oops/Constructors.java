package oops;

public class Constructors {
	/*
	 * Constructors - no return type - used to instantiate the class, same name as class
	 * 3 types
	 * default - no argument constructor
	 * parameterized
	 * 
	 * If constructor has a return type, then it becomes a normal method in that class
	 * Constructor overloading is possible
	 * 
	 * Constructor can call other constructors - constructor chaining
	 * this() - calls the default constructor
	 * this(30) - for parameterized constructor
	 * JVM creates its own only in case there is no user defined constructor.
	 * 
	 * global variable -> this.globalvariable name
	 * 
	 * 
	 * super keyword
	 * to call method of parent class in overriden methods
	 * super keyword is used
	 * super.method() -> calls the parent method
	 * super() -> default constructor of parent class
	 * super("abcd") - > overriden constructor of parent class
	 * 
	 * Constructor chaining
	 * By default, while creating object of child class, constructor of all the parents in the hierarchy is called
	 * However, in the hierarchy if any of the parent constructor is overloaded ,
	 * then we can explicitly call the constructor using super keyword
	 */

}
