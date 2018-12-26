import java.util.Collections;
import java.util.Iterator;
import java.util.List;

	public class NaturalOrder implements Comparable<NaturalOrder> {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		NaturalOrder(String name) {
			super();
			this.name = name;
		}

		public NaturalOrder() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "NaturalOrder [name=" + name + "]";
		}
		@Override

		public int compareTo(NaturalOrder naturalOrder) {
			return this.name.compareTo(naturalOrder.name);

		}

		public List<NaturalOrder> names(List<NaturalOrder> nameList) {
			Iterator<NaturalOrder> iterateNames = nameList.iterator();
			Collections.sort(nameList);
			return nameList;

		}
	}

