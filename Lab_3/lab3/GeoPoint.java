package lab3;
import java.awt.*;

public class GeoPoint extends Point {
    protected String name;

    public GeoPoint(Double initX, Double InitY, String Name ){
        super(initX,InitY);
        name=Name;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = Name;
    }
    public void drawGeoPoint(Graphics G, int width, int height){
        width = 10;
        height = 10;
        G.fillOval((int)super.X, (int)super.Y, width,height);
        G.drawString( name , (int)super.X, (int)super.X );
       
    }

}
