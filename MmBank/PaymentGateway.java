
public class PaymentGateway {
	public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double totalAmountOne) 
	{
		boolean flag =false;

		if ( sender.getAccountBalance()>=totalAmountOne){

			flag =true;

			sender.deposit(-totalAmountOne);

			reciever.deposit(totalAmountOne);

		}

		return flag;
		
	}
}
