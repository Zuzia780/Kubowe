package second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCheckWhoWon {

	@Test
	void draws() {
		Part2 test = new Part2();
		
		int papier = test.checkWhoWon('P','P');
		assertEquals(0,papier);
		
		int kamien=test.checkWhoWon('K','K');
		assertEquals(0, kamien);
		
		int no=test.checkWhoWon('N','N');
		assertEquals(0,no);		
	}
	void firstWins() {
		Part2 test = new Part2();
		
		int papier = test.checkWhoWon('P','K');
		assertEquals(1,papier);
		
		int kamien = test.checkWhoWon('K', 'N');
		assertEquals(1,kamien);
		
		int no=test.checkWhoWon('N','P');
		assertEquals(1, no);
	}
	void secondWind() {
Part2 test = new Part2();
		
		int papier = test.checkWhoWon('K','P');
		assertEquals(2,papier);
		
		int kamien = test.checkWhoWon('N', 'K');
		assertEquals(2,kamien);
		
		int no=test.checkWhoWon('P','N');
		assertEquals(2, no);
	}
}
