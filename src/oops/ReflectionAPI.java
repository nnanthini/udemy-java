package oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionAPI {
/*
 * can be used to get any (inlcuding private) information about class, methods, variables, constructors etc.,
 * 
 * whenever object is created, Class object is automatically created by Java
 * whenever method is executed, Method object is automatically created by Java
 * whenver constructor is executed, Constructor object is automatically created by Java
 * similarly , Parameter object
 * 
 * 
 * In Selenium,
 * public void beforeMethod(Method m) {
 * m.getName() -> will get the name of the test being executed
 * -> this can be useful while entering the logs using log4j
 * }
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReflectionAPI api = new ReflectionAPI();
		System.out.println(api.getClass().getSimpleName());
		
		ArrayListEx arr = new ArrayListEx();
		System.out.println(arr.getClass().getSimpleName());
		
		Class cls = arr.getClass();
		System.out.println(cls.getCanonicalName());
		System.out.println(cls.getDeclaredMethods().length);
		Method[] methods = cls.getDeclaredMethods(); 
		//getMethods() -> will get methods of inherited methods also
		//getDeclaredMethods() => will get methods of that class alone
		Constructor[] cons = cls.getDeclaredConstructors();
		//only through reflection private methods will also be accessible
		System.out.println(methods[2].getName());
		System.out.println(methods[2].getReturnType());
		System.out.println(methods[2].getParameterCount());

	}

}
