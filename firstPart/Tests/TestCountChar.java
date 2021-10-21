import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCountChar {

	@Test
	void wordTest() {
		Tasks1to5 test = new Tasks1to5();
		int word = test.countChar("window", 'w');
		assertEquals(2,word);
	}
	@Test
	void noCharTest() {
		Tasks1to5 test = new Tasks1to5();
		int wordZero=test.countChar("twobeersarebetterthanone", 'z');
		assertEquals(0, wordZero);
	}
	void sentenceTest() {
		Tasks1to5 test = new Tasks1to5();
		int sentence = test.countChar("Hello word", 'o');
		assertEquals(2, sentence);
	}
	@Test
	void spacesTest() {
		Tasks1to5 test = new Tasks1to5();
		int spaces = test.countChar("Jingle bells is it halloween?",' ');
		assertEquals(4,spaces);
	}
	

}
