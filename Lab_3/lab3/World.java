package lab3;
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
            (this.continents.get(i)).drawAll(g);
        }
    }
}
