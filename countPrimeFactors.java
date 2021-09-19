import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countPrimeFactors {
	void test(){
	Task1 test= new Task1();
	int even= test.countPrimeFactors(10);
	assertEquals(2,even);
	int one= test.countPrimeFactors(1);
	assertEquals(0,one);
	int two=test.countPrimeFactors(2);
	assertEquals(1,two);
	int prime=test.countPrimeFactors(11);
	assertEquals(1,prime);
	}
	
	

}

