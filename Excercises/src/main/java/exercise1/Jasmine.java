package exercise1;

public class Jasmine implements Flowers{
	private int jasmineCost=2;
	private int countOfJasmine;
	@Override
	public int getCostofFlowers() {
		if(countOfJasmine>0)
		{
		return jasmineCost*countOfJasmine;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public void setCountofFlowers(int count) {
		this.countOfJasmine=count;
	}

}
