package factorial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;











@RunWith(JUnitPlatform.class)
@TestMethodOrder(OrderAnnotation.class)
class FactTest {
	
	@Test
	@Order(1)
	//@EnabledOnOs({OS.WINDOWS})
	void FactorialPositiveTest() {
		Fact factObj = new Fact();
		
		assertEquals(479001600,factObj.calculateFactorial(12),"Factorial of 12 : 479001600");
	}
	@Test
	@Order(20)
	//@DisabledOnOs({OS.WINDOWS})
	void FactorialOfOneTest() {
		Fact factObj = new Fact();
		assertEquals(1,factObj.calculateFactorial(1),"Factorial expected value should be 1");
	}
	
	@Test
	@Order(50)
	void FactorialOf0Test() {
		Fact factObj = new Fact();
		assertEquals(1,factObj.calculateFactorial(0),"value should be 1");
	}
	
	@Test
	@Order(41)
	void FactorialOfNegativeNumberTest() {
		Fact factObj = new Fact();
		//IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->factObj.calculateFactorial(-3));
		//Throwable ex = assertThrows(IllegalArgumentException.class,()->{Fact factObj = new Fact();
		//factObj.calculateFactorial(-3);});
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->factObj.calculateFactorial(-3));
		assertEquals(" n can't be leass than 0 ",ex.getMessage());
	}
	@Test
	@Order(5)
	void FactorialofEdgeCaseTest() {
		Fact factObj = new Fact();
		IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,()->factObj.calculateFactorial(13));
		assertEquals("n cannot be greater than 12",ex.getMessage());
	}

}
