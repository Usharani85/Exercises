package AbstractFactoryDesignPattern;

public class SBIBankFactory extends AbstractFactory {

	@Override
	public Bank getBank() {
		return new SBI();
	}

	@Override
	public Loan getLoan() {
		// TODO Auto-generated method stub
		return null;
	}
}
