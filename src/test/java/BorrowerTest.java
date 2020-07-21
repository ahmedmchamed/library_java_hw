import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Borrower libraryVisitor;
    private Book storyBook;
    private Book scienceBook;

    @Before
    public void before() {
        library = new Library(100);
        libraryVisitor = new Borrower();
        storyBook = new Book("Lovely Story", "Lovely Author", "Fiction");
        scienceBook = new Book("Science Is Awesome", "Science Person", "Science");
    }

    @Test
    public void canBorrowBookFromLibrary() {
        library.addBookToStock(storyBook);
        library.addBookToStock(scienceBook);
        libraryVisitor.addBookToCollection(library, scienceBook);
        assertEquals("Science Is Awesome", libraryVisitor.getBookCollection().get(0).getTitle());
        assertEquals(1, libraryVisitor.numberOfBooksInCollection());
    }


}
