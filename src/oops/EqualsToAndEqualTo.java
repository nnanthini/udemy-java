package oops;

public class EqualsToAndEqualTo {
	/*
	 * == -> comparison operatore, if object references and addresses are same then returns true
	 * .equals() => compares content of the objects.
	 * 
	 * Singleton desing pattern is achieved by this.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String n = "aBc";
		String n2 = "aBc";
		
		
		System.out.println(n==n2);//true
		System.out.println(n.equals(n2));//true
		
		int i =8;
		int j=8;
		System.out.println(i==j);//true
		
		String x=new String("poi");
		String y=new String("poi");
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//true
		
		*/
		
		//Objects of singleton class
		Singleton s = Singleton.getObject();
		Singleton s1 = Singleton.getObject();
		System.out.println(s==s1);
		System.out.println(s.equals(s1));

	}

}
