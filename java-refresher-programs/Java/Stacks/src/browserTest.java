import static org.junit.Assert.*;

import org.junit.Test;

public class browserTest {

	@Test
	public void testSearchWebsites() {
		browser b = new browser();
		assertEquals(b.searchWebsites(),false);
	}

	@Test
	public void testCheckLastWebsite() {
		browser b = new browser();
		assertEquals(b.checkLastWebsite(),false);
	}

}
