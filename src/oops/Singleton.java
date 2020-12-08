package oops;

public class Singleton {

	/*
	 * 
	 * should have private constructor - no one should be able to create object externally.
	 */
	private static Singleton instance = new Singleton();
	private Singleton() {
		System.out.println("Constructor of Singleton()");
	}
	public static Singleton getObject() {
		return instance;
	}
	

}
