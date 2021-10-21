import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAreEqual {

	@Test
	void equalTest() {
		Tasks1to5 test = new Tasks1to5();
		boolean twos = test.areEqual(2, 2);
		assertEquals(true,twos);
		
		boolean zeros = test.areEqual(0, 0);
		assertEquals(true, zeros);
		
	}
	@Test
	void notEqualTest() {
		Tasks1to5 test = new Tasks1to5();
		boolean twoAnd3 =test.areEqual(2,3);
		assertEquals(false, twoAnd3);
	}

}
