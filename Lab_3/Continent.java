
import java.util.LinkedList;
import java.awt.Graphics;

public class Continent {
    private LinkedList <Country> countries;

    public Continent(LinkedList<Country> Country_list){
        this.countries = Country_list;
    }

    public double getTotalArea(){
        
        double area_countries = 0.0;

        for(int i = 0; i < countries.size(); i++){
            area_countries += countries.get(i).getArea(); 
        }
        return area_countries;
    }

    public void drawAll (Graphics g ) {
        for ( int i = 0; i < countries.size(); i++) {
            (countries.get(i)).drawRegion(g);
            (countries.get(i)).drawCountry(g);
        }
    }
   
}


