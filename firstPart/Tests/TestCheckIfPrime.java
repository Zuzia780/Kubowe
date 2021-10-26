import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCheckIfPrime {

	@Test
	void oneAndTwo() {
		Tasks1to5 test = new Tasks1to5();
		boolean two = test.checkIfPrime(2);
		assertTrue(two);
		boolean one = test.checkIfPrime(1);
		assertFalse(one);
	}
	@Test
	void prime() {
		Tasks1to5 test = new Tasks1to5();
		boolean seven = test.checkIfPrime(7);
		assertTrue(seven);
	}
	@Test
	void test3() {
		Tasks1to5 test = new Tasks1to5();
		boolean even= test.checkIfPrime(12);
		assertFalse(even);
	}
	@Test
	void test4() {
		Tasks1to5 test = new Tasks1to5();
		boolean one = test.checkIfPrime(1);
		assertFalse(one);
	}
	@Test
	void test5() {
		Tasks1to5 test = new Tasks1to5();
		boolean notP = test.checkIfPrime(25);
		assertFalse(notP);
	}

}
