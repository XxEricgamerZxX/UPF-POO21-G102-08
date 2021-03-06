package Lab2;

import java.util.LinkedList;
import java.awt.Graphics;

public class Continent {
    private LinkedList <PolygonalRegion> countries;

    public Continent(LinkedList<PolygonalRegion> polygonal_list){
        this.countries = polygonal_list;
    }

    public double getTotalArea(){
        
        double area_countries = 0.0;

        for(int i = 0; i < countries.size(); i++){
            area_countries += countries.get(i).getArea(); 
        }
        return area_countries;
    }

    public void drawPolygonal(Graphics G){

        for(int i=0; i< countries.size(); i++){
            (countries.get(i)).draw(G);
        }

    }
   
}


