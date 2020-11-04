import java.util.ArrayList;

public class Cards {
    private Students student;
    private double cardId;
    private ArrayList<BorrowingBooks> borrowingBooks;


    public Cards(){

    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public double getCardId() {
        return cardId;
    }

    public void setCardId(double cardId) {
        this.cardId = cardId;
    }

    public ArrayList<BorrowingBooks> getBorrowingBookList() {
        return borrowingBooks;
    }

    public void setBorrowingBookList(ArrayList<BorrowingBooks> borrowingBooks) {
        this.borrowingBooks = borrowingBooks;
    }

    public void showAllBorrowingBooks(){
        for (BorrowingBooks b: borrowingBooks) {
            System.out.println(b.toString());
        }
    }

    @Override
    public String toString() {
        return "Cards{" +
                ", cardId=" + cardId +
                "student=" + student.toString() +
                '}';
    }


}
