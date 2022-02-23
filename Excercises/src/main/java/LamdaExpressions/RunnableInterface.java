package LamdaExpressions;

public class RunnableInterface {
	
	public static void main(String[] args) {
	
	Runnable r1=()->{
		for(int i=0;i<=20;i++) {
			System.out.println(i);
		}
	};
	
	Thread t1=new Thread(r1);
	
	t1.start();
}
}