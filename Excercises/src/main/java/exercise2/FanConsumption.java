package exercise2;

public class FanConsumption extends PoweronDevice{
	private int fanunitconsumption=1;
	public int calculateFanConsumption(int count)
	{
		if(count>0)
		return setCountofHours(count)*fanunitconsumption;
		else
			return 0;
	}
}
