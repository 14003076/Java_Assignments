public class SavingsAccount {
	String name;
	double accountBalance;
	static int accountNumber;
	static int accountNumberGenerator;
	static {
		accountNumberGenerator = 1234;
	}
	// initializers for account number that should be auto generated.
	{

		accountNumber = ++accountNumberGenerator;

	}

	public SavingsAccount(String name, double accountBalance) {
		this.name = name;
		this.accountBalance = accountBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getNextAccountNumber() {
		return getNextAccountNumber();
	}

	public double withdraw(int amountToBeWithdrawn) {
		if (amountToBeWithdrawn <= getAccountBalance()) {
			double totalAmount = getAccountBalance() - amountToBeWithdrawn;
			return totalAmount;
		}
		return 0;

	}

	public double deposit(double deposit) {
		double totalAmount1;
		this.accountBalance = this.accountBalance + deposit;
		return this.accountBalance;
	}
}
