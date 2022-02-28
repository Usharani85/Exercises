package exercise1;

public class Lilly implements Flowers{
	private int lillyCost=3;
	private int countOfLilly;
	@Override
	public int getCostofFlowers() {
		if(countOfLilly>0)
		return lillyCost*countOfLilly;
		else
			return 0;
	}

	@Override
	public void setCountofFlowers(int count) {
		this.countOfLilly=count;
	}

}
