import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkIfPrime {

	@Test
	void test() {
		Task1 test = new Task1();
		boolean two = test.checkIfPrime(2);
		assertEquals(true,two);
		boolean primeNumber = test.checkIfPrime(7);
		assertEquals(true,primeNumber);
		boolean even= test.checkIfPrime(12);
		assertEquals(false,even);
		boolean one = test.checkIfPrime(1);
		assertEquals(false,one);
	}

}
