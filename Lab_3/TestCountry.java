import java.util.LinkedList;

public class TestCountry {
    public static void main( String[] args ) {
        City c1 = new City( 150.0, 200.0, 100 ,"Armand");
        City c2 = new City( 150.0, 100.0, 50, "Eric" );
        City c3 = new City( 150.0, 670.0, 500,"TU"  );
        City c4 = new City( 570.0, 770.0, 500 , "YO" );
        
        System.out.println( "City name: " + c1.getName() + "   hab: " + c1.getNumHab());
        System.out.println( "City name: " + c2.getName() + "   hab: " + c2.getNumHab());
        System.out.println( "City name: " + c3.getName() + "   hab: " + c3.getNumHab());
        System.out.println( "City name: " + c4.getName() + "   hab: " + c4.getNumHab());

        LinkedList<Point> listCities1 = new LinkedList<Point>();
        LinkedList<Point> listCities2 = new LinkedList<Point>();

        
        Country count1 = new Country( "Friend", listCities1, c1);
        count1.addCity(c1);
        count1.addCity(c2);
        Country count2 = new Country( "Whale", listCities2, c3 );
        count2.addCity(c3);
        count2.addCity(c4);

        System.out.println( "Country name: " + count1.getName() + "   Capital: " + count1.getCapital());
        System.out.println( "Country name: " + count2.getName() + "   Capital: " + count2.getCapital());
    }
}
