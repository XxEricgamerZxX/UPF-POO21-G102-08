package lab4;
import java.awt.*;

public abstract class Region extends Entity {
    protected Color fillcolor;
    
    public Region(){
    }
    public void setFillColor( Color InitColor){
        InitColor = fillcolor;
    }

    abstract double getArea();

    abstract Boolean isPointinside(Point p);

}