package AbstractFactoryDesignPattern;

public class ICICI implements Bank {
	private final String BANKNAME;
	ICICI()
	{
		BANKNAME="ICICI BANK";
	}
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BANKNAME;
	}

}
