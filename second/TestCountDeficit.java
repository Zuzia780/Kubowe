package second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCountDeficit {

	@Test
	void shortSame() {
		Part2 test=new Part2();
		
		int test1 = test.countDeficit("KKK","NNN");
		assertEquals(3, test1);
		
		int test2 = test.countDeficit("PPPP", "NNNN");
		assertEquals(4,test2);
		
		int test3 = test.countDeficit("N","P");
		assertEquals(1,test3);
	}
	@Test
	void shortDraw(){
		Part2 test=new Part2();
		
		int test1= test.countDeficit("KPN","PKN");
		assertEquals(0, test1);
		 
		int test2 = test.countDeficit("KPNPK","NNNNN");
				assertEquals(0, test2);
	}	
	
	
}