package AbstractFactoryDesignPattern;

public class LoanCreator {
	public static Loan getFactory(AbstractFactory type)
	{
		return type.getLoan();
	}
}
