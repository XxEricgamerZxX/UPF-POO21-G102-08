import java.util.Currency;
import java.text.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Date;
public class Catalog extends BookCollection{
    public Catalog(){
        super();
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
            String copiesString = book[7];
            int copies = Integer.parseInt( copiesString );
            Book book1 = new Book(title, author, date, place, isbn);
            Stock s1 = new Stock(book1, copies, price, currency);
            collection.add(s1);
        }
    }
}