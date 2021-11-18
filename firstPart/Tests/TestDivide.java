import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDivide {

	@Test
	void divisorZeroTest() {
		Tasks1to5 test = new Tasks1to5();
		double divisorZero = test.divide(5, 0);
		assertEquals(0, divisorZero);	
	}
	@Test
	void divisorSmallerTest() {
		Tasks1to5 test = new Tasks1to5();
		double fiveAnd2 = test.divide(5,2);
		assertEquals(2.5,fiveAnd2);
	}
	@Test
	void dividentSmallerTest() {
		Tasks1to5 test=new Tasks1to5();
		double twoAnd5 = test.divide(2, 5);
		assertEquals(0.4, twoAnd5);
	}
	@Test
	void dividendZeroTest() {
		Tasks1to5 test = new Tasks1to5();
		double five = test.divide(0, 5);
		assertEquals(0,five);
	}

}
