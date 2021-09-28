import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkIfPrime {

	@Test
void oneAndTwo() {
	void oneAndTwo() {
		Tasks1to5 test = new Tasks1to5();
		boolean two = test.checkIfPrime(2);
		assertEquals(true,two);
		boolean one = test.checkIfPrime(1);
		assertFalse(one);
	}
	void prime() {
		Tasks1to5 test = new Tasks1to5();
		boolean seven = test.checkIfPrime(7);
		assertTrue(seven);
	}
	void test3() {
		Tasks1to5 test = new Tasks1to5();
		boolean even= test.checkIfPrime(12);
		assertFalse(even);
	}
	void test4() {
		Tasks1to5 test = new Tasks1to5();
		boolean one = test.checkIfPrime(1);
		assertFalse(one);
	}

