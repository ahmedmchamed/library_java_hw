import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> booksStock;
    private int capacity;

    public Library(int capacity) {
        this.booksStock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public ArrayList<Book> getBooksStockObject() {
        return this.booksStock;
    }

    public int getStockCount() {
        return this.booksStock.size();
    }

    public void addBookToStock(Book book) {
        if (this.capacity > getStockCount()) {
            this.booksStock.add(book);
        }
    }

    public Book removeBookForLoan(Book book) {

        if (this.capacity > getStockCount()) {
            for (Book foundBook : this.booksStock) {
                if (foundBook.getTitle().equals(book.getTitle())) {
                    int index = this.booksStock.indexOf(book);
                    return this.booksStock.remove(index);
                }
            }
        }

        return null;
    }

}
