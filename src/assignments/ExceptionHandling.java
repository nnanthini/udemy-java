package assignments;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * Error - occurs in runtime, not known to compiler, 
		 * happens mostly due to the environment in which program is run, 
		 * recovering from error is not possible
		 * java.lang.Error package
		 * Ex: StackOverflowError, OutofMemoryError
		 * Exception - occurs in runtime, but checked can be known to compiler and unchecked not known to compiler,
		 * happens because of the program itself,
		 * can be handled using try catch throw 
		 * java.lang.Exception
		 * Checked - SQLException, IOException
		 * Unchecked - ArrayIndexOutOfBoundException, NullPointerException
		 * 
		 * Difference between throw and throws
		 * throw
		 * used inside function definiton
		 * only one exception
		 * uses instance of a exception
		 * throws
		 * uses class
		 * multiple exceptions
		 * used in function declaration
		 * 
		 * finally block
		 * to be executed after a particular statement fails in try block
		 * all statements in finally will execute all the time irrespective of 
		 * whether exception has occurred or not
		 * 
		 */
		
		System.out.println("Begin");
		try {
		System.out.println(10/0);
		//If exception occurs in try block, statements after exception statement is not executed.
		//Control goes to catch block directly
		System.out.println("Will not print if there is exception");
		}catch(Exception t) {
			System.out.println(t.toString());
			t.printStackTrace();
		}
		System.out.println("End");
		

	}

}
