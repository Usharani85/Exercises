package AbstractFactoryDesignPattern;

public class BusinessLoanFactory extends AbstractFactory {

	@Override
	public Bank getBank() {
		return null;
	}

	@Override
	public Loan getLoan() {
		return new EducationLoan();
	}

}
