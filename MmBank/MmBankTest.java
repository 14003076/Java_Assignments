import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MmBankTest {
	private SavingsAccount savingsAccount;

	@Before
	public void setUp() {
		savingsAccount = new SavingsAccount("shabzan", 5000.0);
	}

	@Test
	public void testForWithdraw() {
		double expected = 500.0;
		double result = savingsAccount.withdraw(4500);
		assertEquals(expected, result, 0.0);// fail("Not yet implemented");
	}

	@Test
	public void testForDeposit() {
		double expected = 9500.0;
		double result = savingsAccount.deposit(4500);
		assertEquals(expected, result, 0.0);// fail("Not yet implemented");
	}

	@Test
	public void testFundsTransfer() {
		double expected = 9500.0;
		SavingsAccount savingsAccountOne = new SavingsAccount("shabzan", 5000.0);
		SavingsAccount savingsAccountTwo = new SavingsAccount("bhanu", 5000.0);
		savingsAccountOne.deposit(4500);
		boolean result = PaymentGateway.transfer(savingsAccountOne,savingsAccountTwo, 1000.0);
		System.out.println(savingsAccountOne.getAccountBalance());
	}

}
