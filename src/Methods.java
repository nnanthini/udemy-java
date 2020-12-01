
public class Methods {
	// User defined methods
	// Predefined methods
	// E.g. int x = (int) (Math.random()*4); generates a random number between 0-3
	// Math.random() - generates random number btwn 0.0-0.9 in double

	public static void main(String[] args) {
		Methods m = new Methods();
		for (int i = 0; i < 10; i++)
			m.display();
		go();
		m.go();
		m.go1();
		m.go2();
	}

	// access modifier, return type, method name (parameter list) {
	// method body/definition }

	public void display(/* Parameter variables can be declared here but not initialized */) { // declaration of method
		// what function performs is the definition of method
		System.out.println(Math.random() * 4);
		System.out.println((int) (Math.random() * 4));
		/*
		 * Typecasting reduce type to a smaller type
		 */
	}

	// block of statements that perform a particular function/behavior
	//non-static can call other non-static methods directly
	//static methods can call static methods directly
	//non-static can call non-static directly
	//static cant call non-static directly, needs to be called from object of class
	//non-static can call static directly
	// All methods cant be static because it violates OO 
	// Reason why MAIN method is static -> JVM can call without creating a object
	public static void go() {
		//go1();
		System.out.println("Inside go");
	}

	public void go1() {
		go();
		System.out.println("Inside go1");
	}

	public void go2() {
		System.out.println("Inside go2");
	}

}
