import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCountPrimeFactors {

	@Test
	void test() {
		Tasks1to5 test= new Tasks1to5();
		int even= test.countPrimeFactors(10);
		assertEquals(2,even);
		int sq = test.countPrimeFactors(25);
		assertEquals(1,sq);
	}
	@Test
	void oneTest() {
		Tasks1to5 test= new Tasks1to5();
		int one= test.countPrimeFactors(1);
		assertEquals(0,one);
	}
	@Test
	void twoTest() {
		Tasks1to5 test= new Tasks1to5();
		int two=test.countPrimeFactors(2);
		assertEquals(1,two);
	}
	@Test
	void primeTest(){
		Tasks1to5 test= new Tasks1to5();
		int prime=test.countPrimeFactors(11);
		assertEquals(1,prime);
	}
	@Test
	void bigNumberTest() {
		Tasks1to5 test = new Tasks1to5();
		int fewFactors = test.countPrimeFactors(12345);
		assertEquals(3,fewFactors);
		int manyFactors = test.countPrimeFactors(12336);
		assertEquals(6,manyFactors);
	}
	

}
