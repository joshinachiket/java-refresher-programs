import static org.junit.Assert.*;

import org.junit.Test;

public class scientistTest {

	@Test
	public void testStart() {
		scientist sc = new scientist("Sample -1");
		assertEquals(sc.start(), "Sample -1");
	}

}
