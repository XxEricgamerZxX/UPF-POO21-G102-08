import java.util.LinkedList;
import java.awt.Graphics;
public class Country {

    private String name;
    private City Cities [] ;
    private Country neighbors [] ; 
    private City Capital;

    public void Country( LinkedList<Point> Puntos,City cap){
        this.Capital=cap; 
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

    public void drawCountry(Graphics G){

        for(int i=0; i< countries.size(); i++){
            (countries.get(i)).draw(G);
        }

    }
}
