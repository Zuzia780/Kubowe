import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countChar {

	@Test
	void test() {
		Task1 test = new Task1();
		int word = test.countChar("window", 'w');
		assertEquals(2,word);
		int wordZero=test.countChar("twobeersarebetterthanone", 'z');
		assertEquals(0, wordZero);
		int sentence = test.countChar("Hello word", 'o');
		assertEquals(2, sentence);
		int spaces = test.countChar("Jingle bells is it halloween?",' ');
		assertEquals(4,spaces);
				
		}

}
