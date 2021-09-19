import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class areEqual {

	@Test
	void test() {
		Task1 test = new Task1();
		boolean equalNotZero = test.areEqual(2, 2);
		assertEquals(true, equalNotZero);
		boolean notEqual =test.areEqual(2,3);
		assertEquals(false, notEqual);
		boolean equalZero = test.areEqual(0, 0);
		assertEquals(true, equalZero);
	}

}
