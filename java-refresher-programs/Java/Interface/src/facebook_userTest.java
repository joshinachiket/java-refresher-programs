import static org.junit.Assert.*;

import org.junit.Test;

public class facebook_userTest {

	@Test
	public void testSearchName() {
		facebook_user fu = new facebook_user();
		assertEquals(fu.displayName("no"), false);
		assertEquals(fu.displayName("yes"), true);
	}

	@Test
	public void testAddBio() {
		facebook_user fu = new facebook_user();
		assertEquals(fu.addBio(), "success");
		
	}

}
