import java.util.ArrayList;

public class Library {
    private ArrayList<Books> books;
    private ArrayList<Cards> cards;

    public Library(){

    }

    public ArrayList<Books> getBookList() {
        return books;
    }

    public void setBookList(ArrayList<Books> books) {
        this.books = books;
    }

    public ArrayList<Cards> getCardList() {
        return cards;
    }

    public void setCardList(ArrayList<Cards> cards) {
        this.cards = cards;
    }

    public void showAllBooks(){
        for (Books b: books) {
            System.out.println(b.toString());
        }
    }

    public void showAllCards(){
        for (Cards c: cards) {
            System.out.println(c.toString());
        }
    }

    public Books searchBookById(double bookId){
        Books b = new Books();
        for (Books b1: books) {
            if(b1.getBookId() == bookId){
                b = b1;
            }
        }
        return b;
    }

    public Cards searchCardByID(double cardId){
        Cards c = new Cards();
        for (Cards c1: cards) {
            if(c1.getCardId() == cardId){
                c = c1;
            }
        }
        return c;
    }
}
