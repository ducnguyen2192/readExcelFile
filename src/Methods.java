import java.util.Scanner;

public class Methods {

    Scanner input = new Scanner(System.in);
    public void borrowBooks(Library lib){
        System.out.println("input card id: ");
        double cardId = Double.parseDouble(input.nextLine());
        System.out.println("input book id: ");
        double bookId = Double.parseDouble(input.nextLine());
        addNewBorrowingBook(lib, cardId, bookId);
        decreaseBookQuantityByOne(lib, bookId);
        lib.searchCardByID(cardId).showAllBorrowingBooks();
    }

    public void addNewBorrowingBook(Library lib, double cardId, double bookId){
        BorrowingBooks bb = new BorrowingBooks();
        bb.setBorrowingBookId(lib.searchBookById(bookId).getBookId());
        bb.setBorrowingBookName(lib.searchBookById(bookId).getBookName());
        lib.searchCardByID(cardId).getBorrowingBookList().add(bb);
    }

    public void decreaseBookQuantityByOne(Library lib, double bookId){
        Books b = lib.searchBookById(bookId);
        b.setBookQuantity(b.getBookId()-1);
    }

    public void increaseBookQuantityByOne(Library lib, double bookId) {
        Books b = lib.searchBookById(bookId);
        b.setBookQuantity(b.getBookId() + 1);
    }
}
