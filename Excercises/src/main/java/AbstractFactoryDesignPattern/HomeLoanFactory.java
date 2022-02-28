package AbstractFactoryDesignPattern;

public class HomeLoanFactory extends AbstractFactory {

	@Override
	public Bank getBank() {
		return null;
	}

	@Override
	public Loan getLoan() {
		return new HomeLoan();
	}

}
