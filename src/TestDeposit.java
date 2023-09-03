import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.BankAccount;
public class TestDeposit {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDeposit() {
		double initDep = 100.00;
		double dep = 50.00;
		BankAccount ba = new BankAccount(initDep);
		double expected = 150.00;
		double actual = ba.deposit(dep);
		assertEquals(expected, actual, 0);
	}

}
