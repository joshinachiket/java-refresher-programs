import static org.junit.Assert.*;

import org.junit.Test;

public class book_storeTest {

	@Test
	public void testNumberOfPages() {
		book_store bs = new book_store();
		assertEquals(bs.numberOfPages("Harry Potter"), 520);
	}

	@Test
	public void testSearchBook() {
		book_store bs = new book_store();
		assertEquals(bs.searchBook("Harry Potter"), "name");
		
	}

}
