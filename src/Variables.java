
public class Variables {
	/*
	 * Variables
	 * 1. Instance
	 * 2. Local
	 * 3. Class */
	int i = 1; // Instance or global variable (can be accessed anywhere inside class)
	
	public void localVariableMethod() {
		int j = 34; //Local variable (only within this function)
	}
	
	public static void main(String[] args) {
		Variables v = new Variables();
		v.i = 10;
		System.out.println(v.i);
		
		Variables v1 = new Variables();
		v1.i++;
		System.out.println(v1.i);
		
		Variables v2=new Variables();
		System.out.println(v2.i);
		//v.i, v1.i, v2.i -> Class variables -> specific to instance of the class
	}
}
