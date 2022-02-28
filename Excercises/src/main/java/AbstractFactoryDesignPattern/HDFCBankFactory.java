package AbstractFactoryDesignPattern;

public class HDFCBankFactory extends AbstractFactory {

	@Override
	public Bank getBank() {
		return new HDFC();
	}

	@Override
	public Loan getLoan() {
		// TODO Auto-generated method stub
		return null;
	}
}
