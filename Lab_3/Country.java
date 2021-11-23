import java.util.LinkedList;
import java.awt.Graphics;

public class Country extends PolygonalRegion {

    private String name;
    private LinkedList<City> Cities ;
    private Country neighbors [] ; 
    private City Capital;

    public Country( LinkedList<Point> Puntos){
        super(Puntos);
        
    }

    public void addCity(City c){
        int size=0;
        Cities[size]=c;
        size = size + 1;
    }
    public void addneighbor( Country country){
        int size=0;
        neighbors[size]=country;
		size = size + 1;
    }

    public void drawCountry( Graphics g) {
        for ( int i = 0; i < Cities.size(); i++) {
            (this.Cities.get(i)).drawCity( g, (this.Cities.get(i)).getX(), (this.Cities.get(i)).getY());
        }
    }
}
