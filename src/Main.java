import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Library lib = new Library();
        BookImport bookImport = new BookImport();
        Menus m = new Menus();
        Methods method = new Methods();


        do{
            System.out.println("========== Menu ==========");
            System.out.println("1. Import books from Excel");
            System.out.println("2. Add new book");
            System.out.println("3. Add new card");
            System.out.println("4. Borrow book");
            System.out.println("5. Return book");
            System.out.println("6. Export to Excel");
            System.out.println("8. Show all available books");
            System.out.println("9. Show all available cards");



            int choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    lib.setBookList(bookImport.importBook());
                    break;
                case 2:
                    Books b = m.addBookInfo();
                    lib.getBookList().add(b);
                    break;
                case 3:
                    Cards c = m.addCardInfo();
                    lib.getCardList().add(c);
                    lib.showAllCards();
                    break;
                case 4:
                    method.borrowBooks(lib);
                    break;
                case 5:
                    break;
                case 6:
                    ExportToExcel e = new ExportToExcel();
                    e.exportToExcel(lib);
                    break;
                case 8:
                    lib.showAllBooks();
                    break;
                case 9:
                    lib.showAllCards();
                    break;


            }
        }while(true);
    }
}
