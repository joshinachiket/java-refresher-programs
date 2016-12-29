import static org.junit.Assert.*;

import org.junit.Test;

public class collection_functionsTest {

	@Test
	public void testKnowArray() {
		collection_functions cf = new collection_functions();
		int length_ar;
		length_ar = cf.knowArray();
		assertEquals(cf.knowArray(), length_ar);
	}

	@Test
	public void testEmptySet() {
		collection_functions cf = new collection_functions();
		cf.knowArray();
		assertEquals(cf.emptySet(), true);
		cf.createHashset();
		assertEquals(cf.emptySet(), false);
	}

	@Test
	public void testEmptyArray() {
		collection_functions cf = new collection_functions();
		assertEquals(cf.emptyArray(), "success");
	}

	@Test
	public void testSizeOfSet() {
		collection_functions cf = new collection_functions();
		//Enter 5 as ength to get the test correct
		cf.knowArray();
		cf.createHashset();
		assertEquals(cf.sizeOfSet(), 5);
	}

	@Test
	public void testRemoveSetElement() {
		collection_functions cf = new collection_functions();
		cf.knowArray();
		cf.createHashset();
		//Enter a known element o get a correct test
		assertEquals(cf.removeSetElement(), true);
	}

}
