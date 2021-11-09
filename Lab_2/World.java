<<<<<<< HEAD
import java.util.*;
import java.awt.*;

public class World{

    private LinkedList<Continent> continents = new LinkedList<Continent>();;

    
    public World(LinkedList<Continent> init_continentes){
        this.continents = init_continentes;
    }
    
    public double getWorld_TotalArea(){
        double WorldArea = 0.0;
        for(int i = 0; i < this.continents.size(); i++){ 
            WorldArea += (this.continents.get(i)).getTotalArea(); 
        }
        return WorldArea;
    }
    public void drawWorld(Graphics g){
        for(int i=0; i< this.continents.size(); i++){
            (this.continents.get(i)).drawPolygonal(g);
        }
    }
}
=======
import java.util.LinkedList;
import java.awt.Graphics;

public class World {
    private LinkedList <PolygonalRegion> continents;
    public World(LinkedList<PolygonalRegion> polygonal_list){
        this.continents = polygonal_list;
    }
    public void draw(Graphics G){

        for(int i=0; i< continents.size(); i++){
            (continents.get(i)).draw(G);
            
        }

    }
}
>>>>>>> 317a957cd03baa0cab6ed06581c691fc35246306
