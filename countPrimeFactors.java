import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countPrimeFactors {
	void test() {
		Tasks1to5 test= new Tasks1to5();
		int even= test.countPrimeFactors(10);
		assertEquals(2,even);
	}
	void one() {
		Tasks1to5 test= new Tasks1to5();
		int one= test.countPrimeFactors(1);
		assertEquals(0,one);
	}
	void two() {
		Tasks1to5 test= new Tasks1to5();
		int two=test.countPrimeFactors(2);
		assertEquals(1,two);
	}
	void prime(){
		Tasks1to5 test= new Tasks1to5();
		int prime=test.countPrimeFactors(11);
		assertEquals(1,prime);
	}
	

	
	

}

