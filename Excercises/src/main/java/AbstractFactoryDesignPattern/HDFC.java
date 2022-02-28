package AbstractFactoryDesignPattern;

public class HDFC implements Bank {
	private final String BANKNAME;
	HDFC()
	{
		BANKNAME="HDFC BANK";
	}
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BANKNAME;
	}

}
