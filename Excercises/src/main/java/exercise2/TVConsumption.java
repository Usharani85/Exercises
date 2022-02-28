package exercise2;

public class TVConsumption extends PoweronDevice{
	private int tvunitconsumption=3;
	public int calculateTVConsumption(int count)
	{
		if(count>0) 
		return setCountofHours(count)*tvunitconsumption;
		else
			return 0;
	}
}
