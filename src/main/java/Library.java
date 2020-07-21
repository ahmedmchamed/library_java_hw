import java.util.ArrayList;

public class Library {

    private ArrayList<Book> booksStock;
    private int capacity;

    public Library(int capacity) {
        this.booksStock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getNumberOfBooks() {
        return this.booksStock.size();
    }

    public void addBookToStock(Book book) {
        if (this.capacity > getNumberOfBooks()) {
            this.booksStock.add(book);
        }
    }

}
