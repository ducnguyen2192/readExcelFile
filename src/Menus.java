import java.util.ArrayList;
import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);
    public Books addBookInfo(){
        Books b = new Books();
        System.out.println("input book name: ");
        String bookName = input.nextLine();
        System.out.println("input book Id: ");
        double bookId = Double.parseDouble(input.nextLine());
        System.out.println("input book quantity: ");
        double bookQuantity = Double.parseDouble(input.nextLine());
        b.setBookName(bookName);
        b.setBookId(bookId);
        b.setBookQuantity(bookQuantity);
        return b;
    }

    public Cards addCardInfo(){
        ArrayList<BorrowingBooks> borrowingBooks = new ArrayList<>();
        Cards c = new Cards();
        Students s = new Students();
        System.out.println("input student name: ");
        String studentName = input.nextLine();
        s.setStudentName(studentName);
        System.out.println("input student Id: ");
        double studentId = Double.parseDouble(input.nextLine());
        s.setStudentId(studentId);
        System.out.println("input student Address: ");
        String studentAddress = input.nextLine();
        s.setStudentAddress(studentAddress);
        c.setStudent(s);
        System.out.println("input card id: ");
        double  cardID = Double.parseDouble(input.nextLine());
        c.setBorrowingBookList(borrowingBooks);
        c.setCardId(cardID);
        return c;
    }




}
