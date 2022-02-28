package exercise1;

public class Roses implements Flowers {

	private int roseCost=1;
	private int countOfRoses;
	@Override
	public int getCostofFlowers() {
		if(countOfRoses>0)
		return countOfRoses*roseCost;
		else
			return 0;
	}

	@Override
	public void setCountofFlowers(int count) {
		this.countOfRoses=count;
	}
	
}
