package task9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestsumOfPrime {

	@Test
	void toThousand() {
		Task9 test=new Task9();
		
		int test1 = test.sumOfPrime(2);
		assertEquals(2, test1);
		
		int test2 = test.sumOfPrime(10);
		assertEquals(17,test2);
		
		int test3 = test.sumOfPrime(100);
		assertEquals(1060,test3);
		
		int test4 = test.sumOfPrime(1000);
		assertEquals(76127,test4);
		}
	@Test
	void to10Millions () {
		Task9 test=new Task9();
		
		int test1 = test.sumOfPrime(10000);
		assertEquals(5736396, test1);

		
	}
	
	

}
