import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.BankAccount;
public class TestWithdraw {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithdraw() {
		double initDep = 100.00;
		double withdraw = 25.00;
		BankAccount ba = new BankAccount(initDep);		
		ba.withdraw(withdraw);
		assertTrue(ba.withdraw(withdraw) == ba.getBalance());
		
		
	}

}
