public class Books {
    private String bookName;
    private double bookId;
    private double bookQuantity;

    public Books(){

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookId() {
        return bookId;
    }

    public void setBookId(double bookId) {
        this.bookId = bookId;
    }

    public Double getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(double bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                ", bookQuantity=" + bookQuantity +
                '}';
    }
}
