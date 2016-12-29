import static org.junit.Assert.*;

import org.junit.Test;

public class linkedin_userTest {

	@Test
	public void testDisplayName() {
		linkedin_user lu = new linkedin_user();
		assertEquals(lu.displayName("no"), false);
		assertEquals(lu.displayName("yes"), true);
	}

	@Test
	public void testSearchName() {
		linkedin_user lu = new linkedin_user();
		assertEquals(lu.searchName(), "searched element");
	}

	@Test
	public void testLastVisitor() {
		int Return_Value;
		linkedin_user lu = new linkedin_user();
		Return_Value = lu.lastVisitor();
		assertEquals(Return_Value, 10);
	}

}
