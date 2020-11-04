public class BorrowingBooks {
    private String borrowingBookName;
    private double borrowingBookId;

    public BorrowingBooks(){}

    public String getBorrowingBookName() {
        return borrowingBookName;
    }

    public void setBorrowingBookName(String borrowingBookName) {
        this.borrowingBookName = borrowingBookName;
    }

    public double getBorrowingBookId() {
        return borrowingBookId;
    }

    public void setBorrowingBookId(double borrowingBookId) {
        this.borrowingBookId = borrowingBookId;
    }

    @Override
    public String toString() {
        return "BorrowingBooks{" +
                "borrowingBookName='" + borrowingBookName + '\'' +
                ", borrowingBookId=" + borrowingBookId +
                '}';
    }


}
