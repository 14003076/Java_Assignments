
public class PublicTraining extends Training {

	int noOfParticipants;
	public PublicTraining(String subject, int fee,int noOfParticipants) {

		super(subject, fee);
		this.noOfParticipants = noOfParticipants;

	}

	@Override

	public int getOrderValue() {

		int cost = noOfParticipants * getFee();

		return cost;

	}

}