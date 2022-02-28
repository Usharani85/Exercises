package exercise2;

public class LightConSumption extends PoweronDevice{
	private int lightunitconsumption=2;
	public int calculateLightConsumption(int count)
	{
		if(count>0)
		return setCountofHours(count)*lightunitconsumption;
		else
			return 0;
	}
}
