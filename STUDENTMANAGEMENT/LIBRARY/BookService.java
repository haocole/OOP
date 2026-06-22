package STUDENTMANAGEMENT.LIBRARY;

import java.util.ArrayList;

public class BookService {
     private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
    }

    // Show All Books
    public void showBooks() {

        if (books.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Find Book By ID
    public Book findBookById(int id) {

        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }

        return null;
    }

    // Remove Book By ID
    public boolean removeBookById(int id) {

        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                return true;
            }
        }

        return false;
    }
}


