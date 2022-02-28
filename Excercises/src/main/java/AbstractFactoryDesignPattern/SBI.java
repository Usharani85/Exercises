package AbstractFactoryDesignPattern;

public class SBI implements Bank {
	private final String BANKNAME;
	SBI()
	{
		BANKNAME="SBI BANK";
	}
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BANKNAME;
	}

}
