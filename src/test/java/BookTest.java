import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Something Great", "Ralph", "Awesomeness");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Something Great", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Ralph", book.getAuthor());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Awesomeness", book.getGenre());
    }

}
