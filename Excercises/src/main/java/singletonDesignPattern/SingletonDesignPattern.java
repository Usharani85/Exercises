package singletonDesignPattern;

public class SingletonDesignPattern {
	
	//define a class that has only one instance and provides a global point of access to it.
	
	//1.Static member: It gets memory only once because of static, it contains the instance of the Singleton class.
	
	private static SingletonDesignPattern singletonobj=new SingletonDesignPattern();
	
	//Private constructor: It will prevent to instantiate the Singleton class from outside the class.
	
	private SingletonDesignPattern() {};
	
	//Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.
	
	public static SingletonDesignPattern getInstance() {
		
		return singletonobj;
	}
	
	
	public void addition(int a,int b) {
		System.out.println("Sum : "+(a+b));
	}
	
	public void multiplication(int a,int b) {
		System.out.println("Sum : "+(a*b));
	}
	
	public void substraction(int a,int b) {
		System.out.println("Sum : "+(a-b));
	}

}
