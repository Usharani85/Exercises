package AbstractFactoryDesignPattern;

public class ICICIBankFactory extends AbstractFactory {

	@Override
	public Bank getBank() {
		return new ICICI();
	}

	@Override
	public Loan getLoan() {
		// TODO Auto-generated method stub
		return null;
	}
}
