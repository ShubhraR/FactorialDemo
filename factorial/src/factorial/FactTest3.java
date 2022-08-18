/**
 * 
 */
package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author SV071356
 *
 */
class FactTest3 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("in set up");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("in teardown");
	}

	@Test
	void test1() {
		System.out.println("in test-1");
	}
	@Test
	void test2() {
		System.out.println("in test-2");
	}
}
