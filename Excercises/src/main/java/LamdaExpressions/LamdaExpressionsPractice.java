package LamdaExpressions;


interface Lamdapractice{
	int add(int a1,int a2);
}
public class LamdaExpressionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamdapractice lam=(a1,a2)->{
			return a1+a2;
		};
		
		System.out.println(lam.add(3, 5));
	}

}
