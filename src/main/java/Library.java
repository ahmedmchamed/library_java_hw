import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> booksStock;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity) {
        this.booksStock = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreCount = new HashMap<String, Integer>();
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
            if (!this.genreCount.containsKey(book.getGenre())) {
                this.genreCount.put(book.getGenre(), 1);
            }
            else {
                int count = this.genreCount.get(book.getGenre());
                this.genreCount.put(book.getGenre(), count + 1);
            }
        }
    }

    public Book removeBookForLoan(Book book) {

        if (this.booksStock.contains(book)) {
            for (Book foundBook : this.booksStock) {
                if (foundBook.getTitle().equals(book.getTitle())) {
                    int index = this.booksStock.indexOf(book);
                    return this.booksStock.remove(index);
                }
            }
        }

        return null;
    }

    public int getGenreCount(Book book) {
        return this.genreCount.get(book.getGenre());
    }

}
