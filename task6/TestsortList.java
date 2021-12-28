package task6;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class TestsortList {

	@Test
	void idk() {
		int[] list = {1,4,3,6,5,7,8,4};
		int[] sorted = {1,3,4,4,5,6,7,8};
		
		Task6 test= new Task6();
		
		int[] test1=test.sortList(list);
		boolean result =Arrays.equals(test1, sorted);
		assertTrue(result);
		
		
		
	}

}
