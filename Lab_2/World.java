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
