
public class DataTypes {
	public static void main(String[] args) {
		/*
		 * Class (Noun) - Dog, StudentBank
		 * Interface (Adjective) and in Italics font - ActionListener, Runnable
		 * Method (Verb-Noun pair) - getMethod()
		 * Variable - buttonWidth, myName
		 * Constant - FIRST_NAME, LAST_NAME
		 * 
		 */
		
		//primitive
		//whole numbers
		byte b; //1 byte
		short s; //2 byte
		int j; // declaration //4 byte
		int i = 3984203; // initialization
		long l = 249185942758947395l; //8 byte // if l is not added to the end of long, it will be treated as integer
		//fractional numbers
		float f =342.34203989f; //4 byte - upto 7 dec value// if f is not added, it is treated as double
		double d = 342.349821793473903824; //8 byte - upto 16 dec value
		//boolean
		boolean bool = true;
		//characters
		char c = 'a'; //2 byte
		
		String str = "This is a string"; // class not a datatype
		//or
		String abc = new String();
		abc = "New string";
		
		
		//non-primitive
		Student student1 = new Student();
		
		int n1 = 2;
		int n2 = 4;
		String s1="one";
		String s2="two";
		System.out.println(s1+n1+n2+s2); //one24two
		System.out.println(n2+n1+s2); //6two
		System.out.println(s1+(n1+n2)+s2); //one6two
	}

}
