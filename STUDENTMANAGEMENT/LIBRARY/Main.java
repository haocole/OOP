package STUDENTMANAGEMENT.LIBRARY;

public class Main {
     public static void main(String[] args) {

        BookService service = new BookService();

        Book b1 = new Book(
                1,
                "Clean Code",
                "Robert Martin",
                250000
        );

        Book b2 = new Book(
                2,
                "Java Core",
                "Cay Horstmann",
                300000
        );

        // Add Book
        service.addBook(b1);
        service.addBook(b2);

        // Show Books
        System.out.println("===== DANH SACH SACH =====");
        service.showBooks();

        // Find Book
        System.out.println("\n===== TIM SACH ID = 2 =====");

        Book result = service.findBookById(2);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Khong tim thay sach!");
        }

        // Remove Book
        System.out.println("\n===== XOA SACH ID = 1 =====");

        if (service.removeBookById(1)) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay sach!");
        }

        // Show Books Again
        System.out.println("\n===== DANH SACH SAU KHI XOA =====");
        service.showBooks();
    }
}
