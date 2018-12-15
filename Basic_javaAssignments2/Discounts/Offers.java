
public class Offers {

		public int displayDiscount(int itemValue)  //taking inputs
		{
			int newItem=0;
			if(itemValue>=0)                 //checking condition for item offers
			{
				int discount=(itemValue*35)/100;     //discount calculation
				 newItem=itemValue-discount;
			}
			return newItem;                      //returning  new item
		}
	}




