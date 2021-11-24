import java.util.LinkedList;
import java.awt.Graphics;

public class Country extends PolygonalRegion {

    private String name;
    private LinkedList<City> Cities = new LinkedList<City>();
    private Country neighbors [] ; 
    private City Capital;

    public Country(String name, LinkedList<Point> Puntos, City cap){
        super(Puntos);
        this.Capital=cap;
        this.name= name;

    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return Capital.getName();
    }

    public void addCity(City c){
        Cities.add(c);
    }

    public void addneighbor( Country country){
        int size=0;
        neighbors[size]=country;
		size = size + 1;
    }
    public void printCities() {
        System.out.println("List of Cities: ");
        if ( this.Cities == null ) { System.out.println( "There are no cities." ); }
        else for ( int i = 0; i < Cities.size(); i++) {
            System.out.print((Cities.get(i)).getName() + ", ");
        }
        System.out.println("");
    }

    public void drawCountry( Graphics g) {
        for ( int i = 0; i < Cities.size(); i++) {
            boolean isCapital = false;
            if ( (Cities.get(i)).getName() == Capital.getName() ) {
                isCapital = true;
            }
            (Cities.get(i)).drawCity( g, (int)(Cities.get(i)).getX(), (int)(Cities.get(i)).getY(), isCapital );
        }
    }
}
