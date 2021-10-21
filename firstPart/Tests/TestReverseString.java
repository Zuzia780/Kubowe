import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReverseString {

	@Test
	void test() {
		Tasks1to5 test= new Tasks1to5();
		String word= test.reverseString("word");
		assertEquals("drow", word);
	}
	@Test
	void sentenceTest() {
		Tasks1to5 test= new Tasks1to5();
		String sentence=test.reverseString("Hello world");
		assertEquals("dlrow olleH", sentence);
	}
	@Test
	void emptyTest() {
		Tasks1to5 test= new Tasks1to5();
		String empty = test.reverseString("");
		assertEquals("",empty);
	}

}
