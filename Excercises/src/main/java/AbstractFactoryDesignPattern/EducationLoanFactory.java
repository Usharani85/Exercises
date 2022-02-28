package AbstractFactoryDesignPattern;

public class EducationLoanFactory extends AbstractFactory {

	@Override
	public Bank getBank() {
		return null;
	}

	@Override
	public Loan getLoan() {
		return new BussinessLoan();
	}

}
