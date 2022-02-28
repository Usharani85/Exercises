package AbstractFactoryDesignPattern;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {
		Bank bn;
		Loan ln;
		bn=BankCreator.getFactory(new HDFCBankFactory());
		System.out.println("Bank name is "+bn.getBankName());
		ln=LoanCreator.getFactory(new HomeLoanFactory());
		ln.getInterestRate(6.95);
		ln.calculateLoanPayment(2900000, 20);
	}

}
