import static org.junit.Assert.*;

import org.junit.Test;

public class operationsTest {

	@Test
	public void testIsEmpty() {
		int len;
		operations ao = new operations();
		len = ao.create();
		if (len==0)
			assertEquals(ao.isEmpty(),true);
		else
			assertEquals(ao.isEmpty(),false);
	}

	@Test
	public void testSearch() {
		int len;
		operations ao = new operations();
		ao.create();
		assertEquals(ao.search(),false);
	}

}
