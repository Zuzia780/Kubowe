import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countPrimeFactors {
	void test() {
		Tasks1to5 test= new Tasks1to5();
		String word= test.reverseString("word");
		assertEquals("drow", word);
	}
	void sentence() {
		Tasks1to5 test= new Tasks1to5();
		String sentence=test.reverseString("Hello world");
		assertEquals("dlrow olleH", sentence);
	}
	void empty() {
		Tasks1to5 test= new Tasks1to5();
		String empty = test.reverseString("");
		assertEquals("",empty);
	}
	

	
	

}

