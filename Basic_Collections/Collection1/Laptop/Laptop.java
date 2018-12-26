
public class Laptop {
   private String company;
   private String modelNumber;
   private String operatingSystem;
   private String processor;
    Laptop(String company,String modelNumber,String operatingSystem,String processor){
	   this.company = company;
	   this.modelNumber = modelNumber;
	   this.operatingSystem = operatingSystem;
	   this.processor = processor;  
    }
	
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", modelNumber=" + modelNumber
				+ ", operatingSystem=" + operatingSystem + ", processor="
				+ processor + "]";
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

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
}
