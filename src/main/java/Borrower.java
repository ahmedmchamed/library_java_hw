import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    public Borrower() {
        this.bookCollection = new ArrayList<Book>();
    }

    public ArrayList<Book> getBookCollection() {
        return this.bookCollection;
    }

    public int numberOfBooksInCollection() {
        return this.bookCollection.size();
    }

    public void addBookToCollection(Library library, Book book) {
        Book loanedBook = library.removeBookForLoan(book);
        this.bookCollection.add(loanedBook);
    }
}
