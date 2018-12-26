public class Cellphone {
	private String company;
	private String modelNumber;
	private String operatingSystem;
	private String description;
	private double price;

	Cellphone(String company, String modelNumber, String operatingSystem,
			String description, double price) {
		this.company = company;
		this.modelNumber = modelNumber;
		this.operatingSystem = operatingSystem;
		this.description = description;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", modelNumber=" + modelNumber
				+ ", operatingSystem=" + operatingSystem + ", description="
				+ description + ", price=" + price + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
