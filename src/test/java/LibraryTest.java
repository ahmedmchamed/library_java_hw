import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library lovelyLibrary;
    private Book funnyBook;
    private Book suspenseBook;
    private Book thrillerBook;

    @Before
    public void before() {
        lovelyLibrary = new Library(100);
        funnyBook = new Book("Teehee", "Author McGhee", "Fiction");
        suspenseBook = new Book("Woah", "Middlename Danger", "Nonfiction");
        thrillerBook = new Book("Into The Woods", "McMuffin", "Thriller");
    }

    @Test
    public void stockIsEmpty() {
        assertEquals(0, lovelyLibrary.getNumberOfBooks());
    }

    @Test
    public void addBookToStock() {
        lovelyLibrary.addBookToStock(funnyBook);
        assertEquals(1, lovelyLibrary.getNumberOfBooks());
    }

    @Test
    public void cannotAddBooksIfStockAtCapacity() {
        Library localLibrary = new Library(1);
        localLibrary.addBookToStock(funnyBook);
        localLibrary.addBookToStock(suspenseBook);
        localLibrary.addBookToStock(thrillerBook);
        assertEquals(1, localLibrary.getNumberOfBooks());
    }

}
