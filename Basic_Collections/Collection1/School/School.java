
public class School {
	private String name;
	private String city;
	private String district;
	private String rank;

	School(String name, String city, String district,
			String rank) {
		this.name = name;
		this.city = city;
		this.district = district;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district="
				+ district + ", rank=" + rank + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
