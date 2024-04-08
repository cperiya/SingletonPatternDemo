package SingletonPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonObject_Test {

	@Test
	public void getInstance_test() {
		SingleObject object1 = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		
		assertEquals(object1, object2);
		
	}

}
