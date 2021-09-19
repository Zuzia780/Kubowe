import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseString {

	@Test
	void test() {
		Task1 test= new Task1();
		String word= test.reverseString("word");
		assertEquals("drow", word);
		String sentence=test.reverseString("Hello world");
		assertEquals("dlrow olleH", sentence);
		String empty = test.reverseString("");
		assertEquals("",empty);
	}

}
