import java.util.LinkedList;

public class TestCountry {
    public static void main( String[] args ) {
        City c1 = new City( 150.0, 200.0, 100 ,"Mia");
        City c2 = new City( 150.0, 100.0, 50, "Ayesha" );
        City c3 = new City( 150.0, 670.0, 500,"Eye"  );
        City c4 = new City( 570.0, 770.0, 500 , "Nothing" );
        
        System.out.println( "City name: " + c1.getName() + "   hab: " + c1.getNumHab());
        System.out.println( "City name: " + c2.getName() + "   hab: " + c2.getNumHab());
        System.out.println( "City name: " + c3.getName() + "   hab: " + c3.getNumHab());
        System.out.println( "City name: " + c4.getName() + "   hab: " + c4.getNumHab());
    }
}
