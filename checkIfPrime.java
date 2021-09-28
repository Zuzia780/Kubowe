import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkIfPrime {

	@Test
void oneAndTwo() {
		Tasks1to5 test = new Tasks1to5();
		boolean two = test.checkIfPrime(2);
		assertEquals(true,two);
		boolean one = test.checkIfPrime(1);
		assertEquals(false,one);
	}
	void prime() {
		Tasks1to5 test = new Tasks1to5();
		boolean seven = test.checkIfPrime(7);
		assertEquals(true,seven);
	}
	void test3() {
		Tasks1to5 test = new Tasks1to5();
		boolean even= test.checkIfPrime(12);
		assertEquals(false,even);
	}
	void test4() {
		Tasks1to5 test = new Tasks1to5();
		boolean one = test.checkIfPrime(1);
		assertEquals(false,one);
	}
}
