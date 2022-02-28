package AbstractFactoryDesignPattern;

public class BankCreator {
	public static Bank getFactory(AbstractFactory type)
	{
		return type.getBank();
	}
}
