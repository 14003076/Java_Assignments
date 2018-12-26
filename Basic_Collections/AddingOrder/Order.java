
import java.util.Iterator;
import java.util.List;


public class Order {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 Order(String name) {
		super();
		this.name = name;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [name=" + name + "]";
	}
	public List<Object> names(List<Object> listOfNames) {
		Iterator<Object> iterate = listOfNames.iterator();
		for(Object names : listOfNames){
			System.out.println(names);
		}
		return listOfNames;

	}
}
