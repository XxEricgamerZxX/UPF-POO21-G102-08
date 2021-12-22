public class Stock {
    private Book book;
    private int copies;
    private real price;
    private Currency currency;

    public Stock(Book bookinit, int copinit, real priceinit, Currency curinit){
        this.book = bookinit;
        this.copies = copinit;
        this.price = priceinit;
        this.currency= curinit;
    }
    public Book getBook(){
        return this.book;
    }
    public String getBooktitle(){
        return this.book.title;
    }
    public Int numberOfCopies(){
        return this.copies;
    }
    public void addCopies(int numberOfCopies){
        StockInterface.addCopies(numberOfCopies, this.book.title);
    }
    public void removeCopies(int numberOfCopies){
        StockInterface.removeCopies(numberOfCopies, this.book.title);
    }
    public real totalPrice(){
        return this.price;
    }

}
