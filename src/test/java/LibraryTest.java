import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library lovelyLibrary;
    private Book funnyBook;
    private Book suspenseBook;
    private Book thrillerBook;
    private Book relaxingBook;

    @Before
    public void before() {
        lovelyLibrary = new Library(100);
        funnyBook = new Book("Teehee", "Author McGhee", "Fiction");
        suspenseBook = new Book("Woah", "Middlename Danger", "Nonfiction");
        thrillerBook = new Book("Into The Woods", "McMuffin", "Thriller");
        relaxingBook = new Book("Super Relaxing", "Lastname Relax", "AllGood");
    }

    @Test
    public void stockIsEmpty() {
        assertEquals(0, lovelyLibrary.getStockCount());
    }

    @Test
    public void addBookToStock() {
        lovelyLibrary.addBookToStock(funnyBook);
        assertEquals(1, lovelyLibrary.getStockCount());
    }

    @Test
    public void cannotAddBooksIfStockAtCapacity() {
        Library localLibrary = new Library(1);
        localLibrary.addBookToStock(funnyBook);
        localLibrary.addBookToStock(suspenseBook);
        localLibrary.addBookToStock(thrillerBook);
        assertEquals(1, localLibrary.getStockCount());
    }

    @Test
    public void canLoanBook() {
        lovelyLibrary.addBookToStock(funnyBook);
        lovelyLibrary.addBookToStock(suspenseBook);
        lovelyLibrary.removeBookForLoan(funnyBook);
        assertEquals("Woah", lovelyLibrary.getBooksStockObject().get(0).getTitle());
        assertEquals(1, lovelyLibrary.getStockCount());
        assertEquals(null, lovelyLibrary.removeBookForLoan(relaxingBook));
    }

    @Test
    public void canCountBookGenres() {
        lovelyLibrary.addBookToStock(funnyBook);
        lovelyLibrary.addBookToStock(funnyBook);
        lovelyLibrary.addBookToStock(funnyBook);
        lovelyLibrary.addBookToStock(funnyBook);

        lovelyLibrary.addBookToStock(suspenseBook);
        lovelyLibrary.addBookToStock(suspenseBook);
        lovelyLibrary.addBookToStock(suspenseBook);

        lovelyLibrary.addBookToStock(thrillerBook);
        lovelyLibrary.addBookToStock(thrillerBook);

        lovelyLibrary.addBookToStock(relaxingBook);

        assertEquals(10, lovelyLibrary.getStockCount());
        assertEquals(3, lovelyLibrary.getGenreCount(suspenseBook));
    }
}
