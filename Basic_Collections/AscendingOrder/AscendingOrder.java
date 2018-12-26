import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class AscendingOrder implements Comparable<AscendingOrder> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	AscendingOrder(String name) {
		super();
		this.name = name;
	}

	public AscendingOrder() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AscendingOrder [name=" + name + "]";
	}
	@Override

	public int compareTo(AscendingOrder ascendingOrder) {
		return this.name.compareTo(ascendingOrder.name);

	}

	public List<AscendingOrder> names(List<AscendingOrder> nameList) {
		Iterator<AscendingOrder> iterateNames = nameList.iterator();
		Collections.sort(nameList);
		return nameList;

	}

}
