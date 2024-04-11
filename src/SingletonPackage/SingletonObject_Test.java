package SingletonPackage;

import static org.junit.Assert.*;

import org.junit.Test;

/** test class for singleton pattern validation
 * @author Chitra
 * @version 2024.04
 */

public class SingletonObject_Test {

	/**
	 * test case1 to validate singleton pattern
	 */
	@Test
	public void getInstance_test() {
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		
		assertEquals(object1, object2);
		
	}

}
