import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divide {

	@Test
	void test() {
		Task1 test = new Task1();
		double divisorZero = test.divide(5, 0);
		assertEquals(0, divisorZero);
		double divisorSmaller = test.divide(5,2);
		assertEquals(2.5,divisorSmaller);
		double dividendZero = test.divide(0, 5);
		assertEquals(0,dividendZero);
	}

}
