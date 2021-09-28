import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countChar {

	@Test
	void test() {
		void word() {
		Tasks1to5 test = new Tasks1to5();
		int word = test.countChar("window", 'w');
		assertEquals(2,word);
	}
	void noChar() {
		Tasks1to5 test = new Tasks1to5();
		int wordZero=test.countChar("twobeersarebetterthanone", 'z');
		assertEquals(0, wordZero);
	}
	void sentence() {
		Tasks1to5 test = new Tasks1to5();
		int sentence = test.countChar("Hello word", 'o');
		assertEquals(2, sentence);
	}
	void spaces() {
		Tasks1to5 test = new Tasks1to5();
		int spaces = test.countChar("Jingle bells is it halloween?",' ');
		assertEquals(4,spaces);
	}
	
}
