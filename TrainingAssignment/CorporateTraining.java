
public class CorporateTraining extends Training {
	int noOfDays;
	public CorporateTraining(String subject, int fee,int noOfDays) {

		super(subject, fee);
        this.noOfDays = noOfDays;
	}

	@Override

	public int getOrderValue() {

		int cost= noOfDays * getFee();
		return cost;

	}
}
