import java.util.Currency;
import java.util.LinkedList;
import java.util.Date;
import java.text.*;
public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    private Catalog catalog;    
    public ShoppingCart(Catalog cinit){
        super();
        catalog = cinit;
        LinkedList<String[]> list = new LinkedList<String[]>();
        list = readCatalog("Lab-5/books.xml");
        Date date = new Date();
        for (String[] element : list){     
            String[] book = element;
            String title = book[0];
            String author = book[1];
            String dateString = book[2];
            try { date = new SimpleDateFormat().parse( dateString ); }
            catch( Exception e ) {}   
            String place = book[3];
            String isbnString = book[4];
            long isbn = Long.parseLong( isbnString );
            String priceString = book[5];
            double price = Double.parseDouble( priceString ); 
            String currencyString = book[6];
            Currency currency = Currency.getInstance( currencyString );
            Book book1 = new Book(title, author, date, place, isbn);
            Stock s1 = new Stock(book1, 0, price, currency);
            collection.add(s1);
        }         
    }
    @Override
    public void removeCopies(int numberOfCopies, String booktitle){
        catalog.addCopies(numberOfCopies, booktitle);        
        
        for (StockInterface element : catalog.collection){
            if (element.getBooktitle() == booktitle){
                StockInterface stock = getStock(booktitle);
                if(stock == null){
                    Book book = element.getBook();
                    double price = element.totalPrice();
                    Currency currency = element.getCurrency();
                    stock = new Stock(book, numberOfCopies, price, currency);
                    collection.add(stock);
                } else { 
                    super.removeCopies(numberOfCopies, booktitle);
                }
            }
        }
        
    }
    @Override
    public void addCopies(int numberOfCopies, String booktitle){
        catalog.removeCopies(numberOfCopies, booktitle);
        for (StockInterface element : catalog.collection){
            if (element.getBooktitle() == booktitle){
                StockInterface stock = getStock(booktitle);
                if(stock == null){
                    Book book = element.getBook();
                    double price = element.totalPrice();
                    Currency currency = element.getCurrency();
                    stock = new Stock(book, numberOfCopies, price, currency);
                    collection.add(stock);
                } else { 
                    super.addCopies(numberOfCopies, booktitle);
                }
            }
        }  
    }
    public String checkout(){
        double price = totalPrice();
        Currency curr = Currency.getInstance("€");
        Payment p = new Payment();
        return p.doPayment(69420, "Ernesto", price, curr);
    }
    public double totalPrice(){
        double accum = 0;
        for (StockInterface element : catalog.collection){
            double price = element.totalPrice();
            accum += price;
        }
        return accum;
    }

}