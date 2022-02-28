package singletonDesignPattern;

public class SingletonDesignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonDesignPattern instance=SingletonDesignPattern.getInstance();
		instance.addition(3, 2);
		instance.substraction(4, 2);
		instance.multiplication(3, 9);
	}

}
