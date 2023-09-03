import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.BankAccount;
public class TestCreateBankAccountObject {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateBankAccountObject() {
		double initDep = 100;
		BankAccount ba = new BankAccount(initDep);
		assertNotNull(ba);
	}

}
