package factorial;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FactTest2 {
		private Fact factObj = null;
	
	
	@BeforeEach
	void SetUp() {
		factObj = new Fact();
		System.out.println("Before Each test case");

	}
	@Test
	void test() {
		int expected[] = {10,20,30};
		int actual[] = {10,20,30};
		assertArrayEquals(expected, actual,"comparing arrays");
	}
	
	@Test
	void testAll()
	{
		assertAll(
		()->{assertEquals(1,factObj.calculateFactorial(1),"value should be 1");},
				()->{assertEquals(479001600,factObj.calculateFactorial(12),"Factorial of 12 : 479001600");}
				);
		
	}

}
